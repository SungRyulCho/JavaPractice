package com.ohgiraffer.jdbc.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariPoolMXBean;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/*
 * resources -> config.properties
 * 외부 파일로 분리하는 것은 우리가 자바의 소스코드에 리터럴 값으로 DB 엑세스 정보를 저장하는 경우 외부에서 우리의 DB 정보를 확인할 수 있는 문제가 발생
 * 이를 방지하기 위해 우리는 외부 파일로 접근 정보를 분리하고 해당 파일을 참고하는 방식으로 작성하게 되며 이를 통해 데이터의 직접적인 조회를 막는다
 */

public class JDBCConnection {

    private static final HikariDataSource dataSource;
    static {
        try {
            Properties props = new Properties();
            props.load(JDBCConnection.class.getClassLoader().getResourceAsStream("config.properties"));

            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(props.getProperty("db.url"));
            config.setUsername(props.getProperty("db.username"));
            config.setPassword(props.getProperty("db.password"));

            // 최대의 10개의 커넥션 허용
            config.setMaximumPoolSize(10);
            // 최소한 5개의 유휴 상태를 두겠다
            config.setMinimumIdle(5);
            // 30초 동안 유휴 상태이면 커넥션을 닫겠다
            config.setIdleTimeout(30_000);
            // 데이터베이스 커넥션이 생성된 후 사용할 수 있는 최대 시간
            // 시간이 오래 지나면 커넥션이 불안정할 수 있기 떄문에 해당 시간을 초과하면 새 객체로 변경해서 지원
            // -> 커넥션이 열려 있으면 세션에 캐시가 계속해서 쌓이기 때문
            config.setMaxLifetime(1_800_000);
            // 연결 요청이 2초 이상 지연되면 연결 실패로 인식
            // 스레드가 고갈되는 현상을 방지하기 위함
            config.setConnectionTimeout(2_000);
            dataSource = new HikariDataSource(config);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        /*
         * DB에는 세션이라는것이 존재하며 이러한 세션은 DB에 연결한 시점으로 생성됨
         * 이를 기점으로 트랜잭션 임시 데이터, 캐싱 등의 데이터를 관리하게 된다
         *
         * 우리가 사용하는 hikari의 경우 DB 커넥션 객체를 몇 개 생성하고 다른 사용자에게 빌려줬다 반환받는 방식으로 동작
         * 이러한 과정에서 세션이 중복되는 문제가 발생 할 수 있기 때문에 JDBC 내부에서 세션을 새로 초기화한다
         */
        return dataSource.getConnection();
    }

    public static void close() {
        if (dataSource != null) {
            dataSource.close();
        }
    }

    public static void printConnectionPoolStatus() {
        HikariPoolMXBean poolMXBean = dataSource.getHikariPoolMXBean();
        System.out.println("Connection Pool Status");
        System.out.println("Total Connections: " + poolMXBean.getTotalConnections());
        System.out.println("Active Connections: " + poolMXBean.getActiveConnections());
        System.out.println("Idle Connections: " + poolMXBean.getIdleConnections());
        System.out.println("Threads Awaiting Connections: " + poolMXBean.getThreadsAwaitingConnection());
    }
}

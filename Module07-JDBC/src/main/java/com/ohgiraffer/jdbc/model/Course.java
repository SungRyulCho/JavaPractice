package com.ohgiraffer.jdbc.model;

public class Course {

    private long courseID;
    private long authorID;
    private String title;
    private String description;
    private String status;

    // EMPTY
    public Course() {

    }

    // ALL
    public Course(long courseID, long authorID, String title, String description, String status) {
        this.courseID = courseID;
        this.authorID = authorID;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    // 등록용
    public Course(long authorID, String title, String description, String status) {
        this.authorID = authorID;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    public long getAuthorID() {
        return authorID;
    }

    public void setAuthorID(long authorID) {
        this.authorID = authorID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", authorID=" + authorID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

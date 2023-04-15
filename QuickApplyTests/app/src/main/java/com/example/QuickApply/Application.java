package com.example.QuickApply;
public class Application {
    private Student student;
    private String collegeName;
    private String programName;

    public Application(Student student, String collegeName, String programName) {
        this.student = student;
        this.collegeName = collegeName;
        this.programName = programName;
    }

    public Student getStudent() {
        return student;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getProgramName() {
        return programName;
    }
}

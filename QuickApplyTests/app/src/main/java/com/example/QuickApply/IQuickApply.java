package com.example.QuickApply;

import java.util.List;

public interface IQuickApply {
    List<College> getAllColleges();
    List<Application> getApplications();
    void addCollege(College college);
    College getCollege(String name);
    void addUser(String email, String password);
    boolean authenticateUser(String email, String password);
    void addStudent(Student student);
    Student getStudent(String email);
    void addApplication(Application application);
}

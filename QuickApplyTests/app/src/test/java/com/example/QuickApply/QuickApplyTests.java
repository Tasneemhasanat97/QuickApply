package com.example.QuickApply;
import com.example.QuickApply.Application;
import com.example.QuickApply.College;
import com.example.QuickApply.Student;
import com.example.QuickApply.QuickApply;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickApplyTests {
    private QuickApply quickApply;

    @BeforeEach
    void setUp() {
        quickApply = new QuickApply();
    }
    // Unit Test 1
@Test
void testAddAndGetStudent() {
    Student student = new Student("test@example.com", "John Doe", "1200", "3.5");
    quickApply.addStudent(student);

    Student retrievedStudent = quickApply.getStudent("test@example.com");
    assertEquals(student, retrievedStudent);
}

// Unit Test 2
@Test
void testAddAndGetCollege() {
    College college = new College("Test College", "1000", "3.0");
    quickApply.addCollege(college);

    College retrievedCollege = quickApply.getCollege("Test College");
    assertEquals(college, retrievedCollege);
}

// Component Test
@Test
void testApplicationProcess() {
    // Create student profile
    Student student = new Student("applicant@example.com", "Alice Smith", "1300", "3.8");
    quickApply.addStudent(student);

    // View colleges
    List<College> colleges = quickApply.getAllColleges();
    assertFalse(colleges.isEmpty(), "There should be at least one college in the list");

    // Apply for a program
    String collegeName = colleges.get(0).getName();
    String programName = "Engineering";
    Application application = new Application(student, collegeName, programName);
    quickApply.addApplication(application);

    // Check if application was added
    List<Application> applications = quickApply.getApplications();
    assertFalse(applications.isEmpty(), "There should be at least one application in the list");
    assertEquals(application, applications.get(0), "The submitted application should be in the list of applications");
}


}

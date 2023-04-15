import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuickApply {
    private static QuickApply instance;

    private Map<String, College> colleges;
    private Map<String, String> users;
    private Map<String, Student> students;
    private List<Application> applications;
    public List<College> getAllColleges() {
        return new ArrayList<>(colleges.values());
    }

    private QuickApply() {  
        this.colleges = new HashMap<>();
        this.users = new HashMap<>();
        this.students = new HashMap<>();
        this.applications = new ArrayList<>();
        // Add some example colleges
        addExampleColleges();
        
    }

    public static QuickApply getInstance() {
        if (instance == null) {
            instance = new QuickApply();
        }
        return instance;
    }

    public void addCollege(College college) {
        this.colleges.put(college.getName(), college);
    }

    public College getCollege(String name) {
        return this.colleges.get(name);
    }

    public void addUser(String email, String password) {
        this.users.put(email, password);
    }

    public boolean authenticateUser(String email, String password) {
        String storedPassword = this.users.get(email);
        return storedPassword != null && storedPassword.equals(password);
    }

    private void addExampleColleges() {
        // Add some example colleges here
        College exampleCollege1 = new College("Stanford", "600", "4.0");
        College exampleCollege2 = new College("MIT", "300", "4.0");
        addCollege(exampleCollege1);
        addCollege(exampleCollege2);
    }

    public void addStudent(Student student) {
        this.students.put(student.getEmail(), student);
    }

    public Student getStudent(String email) {
        return this.students.get(email);
    }

    public void addApplication(Application application) {
        this.applications.add(application);
    }
}

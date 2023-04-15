public class Student {
    private String email;
    private String name;
    private String satScore;
    private String gpa;

    public Student(String email, String name, String satScore, String gpa) {
        this.email = email;
        this.name = name;
        this.satScore = satScore;
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSatScore() {
        return satScore;
    }

    public String getGpa() {
        return gpa;
    }
}

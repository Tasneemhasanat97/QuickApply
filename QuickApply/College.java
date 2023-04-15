import java.util.List;

public class College {
    private String name;
    private Admissions admissions;
    private List<School> schools;

    public College(String name, String satScoreRequirement, String gpaRequirement) {
        this.name = name;
        this.admissions = new Admissions(satScoreRequirement, gpaRequirement);
    }

    public String getName() {
        return name;
    }

    public Admissions getAdmissions() {
        return admissions;
    }

    public List<School> getSchools() {
        return schools;
    }
}

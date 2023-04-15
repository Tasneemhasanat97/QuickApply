import java.util.Date;
import java.util.List;

public class Admissions {
    private List<Requirement> requirements;
    private Date deadline;
    private String satScoreRequirement;
    private String gpaRequirement;

    public Admissions(String satScoreRequirement, String gpaRequirement) {
        this.satScoreRequirement = satScoreRequirement;
        this.gpaRequirement = gpaRequirement;
    }

    public String getSatScoreRequirement() {
        return satScoreRequirement;
    }

    public String getGpaRequirement() {
        return gpaRequirement;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public Date getDeadline() {
        return deadline;
    }
}

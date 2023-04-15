import java.util.List;

public class School {
    private String name;
    private List<Program> programs;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Program> getPrograms() {
        return programs;
    }
}

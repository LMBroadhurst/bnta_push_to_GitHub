import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<FootballEmployee> employees;
    private String slogan;

    public Team(String name, String slogan) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.slogan = slogan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<FootballEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<FootballEmployee> employees) {
        this.employees = employees;
    }

    public void addEmployee(FootballEmployee newEmployee) {
        employees.add(newEmployee);
    }

    public void removeEmployee(FootballEmployee firedEmployee) {
        employees.remove(firedEmployee);
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}

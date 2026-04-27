import java.util.ArrayList;
import java.util.List;

/**
 * Composite class representing a Department in the Composite Design Pattern.
 * A Department can contain Teachers and Students.
 */
public class Department implements EducationalUnit {
    private String name;
    private List<EducationalUnit> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void add(EducationalUnit unit) {
        members.add(unit);
    }

    public void remove(EducationalUnit unit) {
        members.remove(unit);
    }

    /**
     * Sum of student counts across all child units.
     */
    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalUnit unit : members) {
            count += unit.getStudentCount();
        }
        return count;
    }

    /**
     * Budget = sum of teacher salaries - sum of student tuition fees.
     */
    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : members) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "[Department] " + name);
        for (EducationalUnit unit : members) {
            unit.displayDetails(indent + "    ");
        }
    }
}

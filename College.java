import java.util.ArrayList;
import java.util.List;

/**
 * Composite class representing a College in the Composite Design Pattern.
 * A College can contain Departments, Teachers, Students, and even other Colleges.
 */
public class College implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void add(EducationalUnit unit) {
        units.add(unit);
    }

    public void remove(EducationalUnit unit) {
        units.remove(unit);
    }

    /**
     * Recursively sums student count across all child units (departments, sub-colleges, students).
     */
    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalUnit unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    /**
     * Budget = sum of all child budgets (departments, teachers, sub-colleges)
     *          minus sum of all direct student tuition fees.
     * Each child already computes its own budget recursively.
     */
    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "=== [College] " + name + " ===");
        for (EducationalUnit unit : units) {
            unit.displayDetails(indent + "    ");
        }
    }
}

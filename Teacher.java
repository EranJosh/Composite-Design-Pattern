/**
 * Leaf class representing a Teacher in the Composite Design Pattern.
 * A teacher has a name, subject, and salary.
 */
public class Teacher implements EducationalUnit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * A Teacher is a leaf node — no children, so student count is 0.
     */
    @Override
    public int getStudentCount() {
        return 0;
    }

    /**
     * A Teacher's budget contribution is their salary.
     */
    @Override
    public double getBudget() {
        return salary;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "[Teacher] " + name
                + " | Subject: " + subject
                + " | Salary: PHP " + String.format("%.2f", salary));
    }
}

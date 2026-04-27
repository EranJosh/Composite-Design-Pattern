/**
 * Leaf class representing a Student in the Composite Design Pattern.
 * A student has a name, student ID, and tuition fee.
 */
public class Student implements EducationalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    /**
     * A Student counts as 1 student.
     */
    @Override
    public int getStudentCount() {
        return 1;
    }

    /**
     * A Student's budget contribution is negative (cost to the institution).
     */
    @Override
    public double getBudget() {
        return -tuitionFee;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "[Student] " + name
                + " | ID: " + studentId
                + " | Tuition: PHP " + String.format("%.2f", tuitionFee));
    }
}

/**
 * Component interface for the Composite Design Pattern.
 * All educational units (College, Department, Teacher, Student) implement this.
 */
public interface EducationalUnit {
    void displayDetails(String indent);
    int getStudentCount();
    double getBudget();
    String getName();
}

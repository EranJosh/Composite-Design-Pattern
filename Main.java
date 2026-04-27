/**
 * Client program demonstrating the Composite Design Pattern
 * for New Era University's organizational structure.
 */
public class Main {
    public static void main(String[] args) {

        // --- Create Teachers ---
        Teacher t1 = new Teacher("Dr. Reyes",    "Software Engineering",  85000);
        Teacher t2 = new Teacher("Prof. Santos",  "Data Structures",       72000);
        Teacher t3 = new Teacher("Dr. Cruz",      "Business Analytics",    90000);
        Teacher t4 = new Teacher("Prof. Lim",     "Accounting",            68000);
        Teacher t5 = new Teacher("Dr. Garcia",    "Applied Mathematics",   75000);

        // --- Create Students ---
        Student s1 = new Student("Alice Mendoza",  "2021-0001", 45000);
        Student s2 = new Student("Bob Tan",        "2021-0002", 45000);
        Student s3 = new Student("Carla Vega",     "2022-0003", 42000);
        Student s4 = new Student("Dan Flores",     "2022-0004", 42000);
        Student s5 = new Student("Eva Ramos",      "2023-0005", 48000);
        Student s6 = new Student("Felix Ong",      "2023-0006", 40000);

        // --- Create Departments ---
        Department csDept = new Department("Department of Computer Science");
        csDept.add(t1);
        csDept.add(t2);
        csDept.add(s1);
        csDept.add(s2);

        Department itDept = new Department("Department of Information Technology");
        itDept.add(t5);
        itDept.add(s3);
        itDept.add(s4);

        Department baDept = new Department("Department of Business Administration");
        baDept.add(t3);
        baDept.add(t4);
        baDept.add(s5);
        baDept.add(s6);

        // --- Create Colleges ---
        College coe = new College("College of Engineering");
        coe.add(csDept);
        coe.add(itDept);

        College cob = new College("College of Business");
        cob.add(baDept);

        // --- Create University (top-level College) ---
        College university = new College("New Era University");
        university.add(coe);
        university.add(cob);

        // -----------------------------------------------
        // Display Details
        // -----------------------------------------------
        System.out.println("==========================================");
        System.out.println("       NEW ERA UNIVERSITY - DETAILS       ");
        System.out.println("==========================================");
        university.displayDetails("");

        // -----------------------------------------------
        // Total Student Count
        // -----------------------------------------------
        System.out.println("\n==========================================");
        System.out.println("TOTAL STUDENTS IN NEW ERA UNIVERSITY: "
                + university.getStudentCount());
        System.out.println("==========================================");

        // -----------------------------------------------
        // Total Budget
        // -----------------------------------------------
        System.out.println("\n==========================================");
        System.out.printf("TOTAL BUDGET OF NEW ERA UNIVERSITY: PHP %.2f%n",
                university.getBudget());
        System.out.println("==========================================");

        // -----------------------------------------------
        // Breakdown by College
        // -----------------------------------------------
        System.out.println("\n--- Budget Breakdown by College ---");
        System.out.printf("  %s: PHP %.2f (%d students)%n",
                coe.getName(), coe.getBudget(), coe.getStudentCount());
        System.out.printf("  %s: PHP %.2f (%d students)%n",
                cob.getName(), cob.getBudget(), cob.getStudentCount());
    }
}

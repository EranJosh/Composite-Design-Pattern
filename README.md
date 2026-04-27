# New Era University – Composite Design Pattern

A Java implementation of the **Composite Design Pattern** modeling the organizational structure of New Era University (Colleges, Departments, Teachers, and Students).

---

## Pattern Overview

This project uses the Composite pattern to represent a part-whole hierarchy, allowing client code to treat individual objects (Teacher, Student) and compositions (Department, College) uniformly through a single `EducationalUnit` interface.

---

## Project Structure

```
├── EducationalUnit.java   # Component interface
├── Teacher.java           # Leaf – individual teacher
├── Student.java           # Leaf – individual student
├── Department.java        # Composite – contains teachers and students
├── College.java           # Composite – contains departments, teachers, students, or sub-colleges
└── Main.java              # Client – builds the hierarchy and runs demonstrations
```

---

## Class Roles

| Class | Pattern Role | Can Contain |
|---|---|---|
| `EducationalUnit` | Component (interface) | — |
| `Teacher` | Leaf | Nothing |
| `Student` | Leaf | Nothing |
| `Department` | Composite | Teachers, Students |
| `College` | Composite | Departments, Teachers, Students, other Colleges |

---

## Features

- **Display details** – recursively prints the full hierarchy with indentation
- **Count students** – recursively totals students across all sub-units
- **Calculate budget** – recursively computes budget where:
  - Teacher contributes `+salary`
  - Student contributes `-tuitionFee`
  - Department/College sums all children

---

## How to Run

**Requirements:** Java 8 or higher

```bash
# Compile
javac *.java

# Run
java Main
```

**Expected output:**
```
==========================================
       NEW ERA UNIVERSITY - DETAILS
==========================================
=== [College] New Era University ===
    === [College] College of Engineering ===
        [Department] Department of Computer Science
            [Teacher] Dr. Reyes | Subject: Software Engineering | Salary: PHP 85000.00
            ...

TOTAL STUDENTS IN NEW ERA UNIVERSITY: 6
TOTAL BUDGET OF NEW ERA UNIVERSITY: PHP 128000.00
```

---

## UML Class Diagram

<img width="5675" height="2585" alt="UML Class Diagram" src="https://github.com/user-attachments/assets/9f734e00-fd6d-4338-ab74-909625a8d02b" />


---

## Lab Assignment

**Course:** Software Design Patterns  
**Institution:** New Era University  
**Pattern:** Composite (Structural)

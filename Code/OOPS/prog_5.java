class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }

    public void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + collegeLoc);
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College: ");
        college.displayCollegeInfo();
    }
}

public class prog_5 {
    public static void main(String[] args) {
        // Instantiate College objects
        College college1 = new College("ABC College", "City A");
        College college2 = new College("XYZ College", "City B");

        // Instantiate Student objects and enroll them in colleges
        Student student1 = new Student(101, "John", college1);
        Student student2 = new Student(102, "Emma", college2);

        // Display college information
        System.out.println("College 1 Information:");
        college1.displayCollegeInfo();
        System.out.println();

        System.out.println("College 2 Information:");
        college2.displayCollegeInfo();
        System.out.println();

        // Display student information
        System.out.println("Student 1 Information:");
        student1.displayStudentInfo();
        System.out.println();

        System.out.println("Student 2 Information:");
        student2.displayStudentInfo();
    }
}

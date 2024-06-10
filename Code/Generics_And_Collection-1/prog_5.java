import java.util.*;
class Student implements Comparable<Student> 
{
    private String name;
    private int rn;
    private int totalMark;

    public Student(String name, int rn, int totalMark) 
    {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    @Override
    public int compareTo(Student other) {
        if (this.rn < other.rn) {
            return -1; 
        } else if (this.rn > other.rn) {
            return 1; 
        } else {
            return 0;
        }
    }
    
    public static void bubbleSortByRollNumber(Student[] students) 
    {
        int n=students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap students[j] and students[j+1]
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rn);
        System.out.println("Total Marks: " + totalMark);
    }
    
}

public class prog_5 
{
	public static void main(String[] args) 
	{
		Student arr1[]=new Student[3];
		
		arr1[0]=new Student("Yuvraj",1,80);
		arr1[1]=new Student("Satyam",20,90);
		arr1[2]=new Student("Modiji",3,400);
		
	    Student.bubbleSortByRollNumber(arr1);

	    System.out.println("Sorted Students:");
	    for (Student student : arr1) 
	    {
	        student.printDetails();
	        System.out.println();
	    }
	}
}

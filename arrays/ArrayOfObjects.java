package arrays;

class Student {
    String name;
    int rollNumber;
    float marks;
}

public class ArrayOfObjects {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amar";
        s1.rollNumber = 2;
        s1.marks = 35.5f;

        Student s2 = new Student();
        s2.name = "Akbar";
        s2.rollNumber = 1;
        s2.marks = 40.5f;

        Student s3 = new Student();
        s3.name = "Anthony";
        s3.rollNumber = 3;
        s3.marks = 45.5f;

        // Create an array of students
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].marks);
        }
    }
}

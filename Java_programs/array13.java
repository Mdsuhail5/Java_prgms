// Array of objects in java

public class array13 {

    public static void main(String args[]) {

        Students s1 = new Students();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 85;

        Students s2 = new Students();
        s2.rollno = 2;
        s2.name = "Nandan";
        s2.marks = 95;

        Students s3 = new Students();
        s3.rollno = 3;
        s3.name = "Raj";
        s3.marks = 55;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rollno + "|" + students[i].name + ":" + students[i].marks);
        }
    }
}

class Students {

    int rollno;
    String name;
    int marks;
}

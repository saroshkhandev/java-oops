package classes_and_objects;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Sarosh", 5);
//        s1.name = "Sarosh";
//        s1.rollNumber = 5;
//        s1.setRollNumber(-5);

        Student s2 = new Student("Faraz", 10);
//        s2.name = "Faraz";
//        s2.rollNumber = 10;
//        s2.setRollNumber(10);

//        System.out.println(s1.name);
//        System.out.println(s1.getRollNumber());
        s1.print();
        System.out.println();
        s2.print();

//        System.out.println(s1.numStudents);
//        System.out.println(s2.numStudents);
        System.out.println(Student.getNumStudents());
//        System.out.println(s2.name);
//        System.out.println(s2.getRollNumber());
    }
}

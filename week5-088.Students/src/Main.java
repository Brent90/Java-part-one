
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here the main program
//        Student pekka = new Student("Pekka Mikkola", "013141590");
//        System.out.println("name: " + pekka.getName());
//        System.out.println("studentnumber: " + pekka.getStudentNumber());
//        System.out.println(pekka);

        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();

            list.add(new Student(name, studentNumber));

        }

        //prints students
        for (Student student : list) {
            System.out.println(student);
        }

        //search for students
        System.out.print("Give search term: ");
        String searchFor = reader.nextLine();
        System.out.println("Result");

        for (Student student : list) {
            if (student.getName().contains(searchFor)) {
                System.out.println(student);
            }
        }

    }
}

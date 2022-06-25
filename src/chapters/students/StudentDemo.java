package chapters.students;

import java.util.Scanner;

public class StudentDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentsStorage studentsStorage = new StudentsStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add student");
            System.out.println("please input 2 for print all student");
            System.out.println("please input 3 for delete student by index");
            System.out.println("please input 4 for print student by lesson");
            System.out.println("please input 5 for print students count");
            System.out.println("please input 6 for changing student lesson by index");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentsStorage.print();
                    break;
                case 3:
                    studentsStorage.print();
                    System.out.println("Please choose student index");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentsStorage.deleteByIndex(index);
                    break;
                case 4:
                    System.out.println("Please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentsStorage.printStudentsByLessonName(lessonName);
                    break;
                case 5:
                    System.out.println("Students count");
                    System.out.println(studentsStorage.getSize());
                    break;
                case 6:
                    studentsStorage.print();
                    System.out.println("Please choose student index");
                    index = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input lesson name");
                    String lesson = scanner.nextLine();
                    studentsStorage.ChangeLessonByIndex(lesson);
                    break;
                default:
                    System.out.println("Invalid command");

            }

        }


    }

    private static void addStudent() {
        System.out.println("Please input student's name");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student's age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student's phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's city");
        String city = scanner.nextLine();
        System.out.println("Please input student's lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentsStorage.add(student);
        System.out.println("student created");

    }
}

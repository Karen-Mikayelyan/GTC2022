package chapters.students;

import chapters.students.command.Commands;
import chapters.students.model.Lesson;
import chapters.students.model.Student;
import chapters.students.storage.LessonStorage;
import chapters.students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("java", "teacher java", 7, 10000);
        Lesson mySql = new Lesson("myScl", "teacher myScl", 5, 7000);
        Lesson php = new Lesson("php", "teacher php", 3, 5000);
        lessonStorage.add(java);
        lessonStorage.add(mySql);
        lessonStorage.add(php);
        studentStorage.add(new Student("poxos", "poxosyan", 25, "077777777", "Gyumri", java));
        studentStorage.add(new Student("petros", "poxosyan", 33, "077777877", "Gyumri", mySql));
        studentStorage.add(new Student("martiros", "poxosyan", 21, "077779777", "Gyumri", php));
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_Students:
                    studentStorage.print();
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("Students count" + studentStorage.getSize());
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLessonName();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");

            }

        }
    }


    private static void addLesson() {
        System.out.println("Please input lessonName");
        String lessonName = scanner.nextLine();
        System.out.println("Please input teacherName");
        String teacherName = scanner.nextLine();
        System.out.println("Please input lesson duration by month");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(lessonName, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("lesson created");
    }


    private static void changeStudentLessonName() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student == null) {
            System.out.println("Wrong index !!!");
            changeStudentLessonName();
        } else {
            if (lessonStorage.getSize() != 0) {
                lessonStorage.print();
                System.out.println("Please choose lesson index");
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                if (lesson != null) {
                    student.setLesson(lesson);
                    System.out.println("lesson changed!");
                }
            }
        }
    }


    private static void printStudentsByLessonName() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {
        if (lessonStorage.getSize() != 0) {
            lessonStorage.print();
            System.out.println("Please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please choose correct index!!!");
                addStudent();
            } else {
                System.out.println("Please input student's name");
                String name = scanner.nextLine();
                System.out.println("Please input student's surname");
                String surname = scanner.nextLine();
                System.out.println("Please input student's age");
                System.out.println("Please input student's phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student's city");
                String city = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());

                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Student created");
            }
        }
    }

}



package chapters.students;

import chapters.students.command.Commands;
import chapters.students.exception.LessonNotFoundException;
import chapters.students.model.Lesson;
import chapters.students.model.Student;
import chapters.students.model.User;
import chapters.students.model.UserType;
import chapters.students.storage.LessonStorage;
import chapters.students.storage.StudentStorage;
import chapters.students.storage.UserStorage;

import java.util.Date;
import java.util.Scanner;

import static chapters.students.util.DateUtil.stringToDate;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();
    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;

    public static void main(String[] args) {
        initData();

        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    private static void login() {
        System.out.println("please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with " + emailPassword[0] + " does not exists!");
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentUser = user;
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("Password is wrong!");
            }
        }

    }

    private static void loginUser() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
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
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("Students count" + studentStorage.getSize());
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");
            }

        }
    }

    private static void register() {
        System.out.println("please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input correct data!");
        } else {
            if (userStorage.getUserByEmail(userData[0]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setUserType(UserType.USER);
                userStorage.add(user);
                System.out.println("User created!");
            } else {
                System.out.println("user with " + userData[0] + " already exists");
            }

        }

    }


    private static void loginAdmin() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
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

    public static void initData() {
        User admin = new User("admin", "admin", "admin@mail.com", "admin", UserType.ADMIN);
        userStorage.add(admin);
        Lesson java = new Lesson("java", "teacher java", 7, 10000, stringToDate("05/05/2022"));
        Lesson mySql = new Lesson("myScl", "teacher myScl", 5, 7000, stringToDate("07/07/2022"));
        Lesson php = new Lesson("php", "teacher php", 3, 5000, stringToDate("08/08/2022"));
        lessonStorage.add(java);
        lessonStorage.add(mySql);
        lessonStorage.add(php);
        studentStorage.add(new Student("poxos", "poxosyan", 25, "077777777", "Gyumri", java, admin, new Date(

        )
        ));
        studentStorage.add(new Student("petros", "poxosyan", 33, "077777877", "Gyumri", mySql, admin, new Date()));
        studentStorage.add(new Student("martiros", "poxosyan", 21, "077779777", "Gyumri", php, admin, new Date()));
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
        System.out.println("Please input lesson start date (14/12/2022)");
        String strDate = scanner.nextLine();
        Lesson lesson = new Lesson(lessonName, teacherName, duration, price, stringToDate(strDate));
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
                try {
                    int lessonIndex = Integer.parseInt(scanner.nextLine());
                    Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                    student.setLesson(lesson);
                    System.out.println("lesson changed!");
                } catch (LessonNotFoundException | NumberFormatException e) {
                    System.out.println("Please input correct number or index!");
                    changeStudentLessonName();
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
            Lesson lesson = null;
            try {
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                lesson = lessonStorage.getLessonByIndex(lessonIndex);
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

                Student student = new Student(name, surname, age, phoneNumber, city, lesson, currentUser, new Date());
                studentStorage.add(student);
                System.out.println("Student created");
            } catch (LessonNotFoundException | NumberFormatException e) {
                System.out.println("Please choose correct number or index!!!");
                addStudent();
            }

        }
    }

}



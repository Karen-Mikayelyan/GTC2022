package homework.books;


import homework.books.model.*;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.UserStorage;


import java.util.Scanner;


public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;
    private static Gender gender;

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

        private static void login () {
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




        private static void loginUser () {
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
                    case PRINT_ALL_BOOKS:
                        bookStorage.print();
                        break;
                    case PRINT_BOOKS_BY_AUTHOR_NAME:
                        printBooksByAuthorName();
                        break;
                    case PRINT_BOOKS_BY_GENRE:
                        printBooksByGenre();
                        break;
                    case PRINT_BOOKS_BY_PRICE_RANGE:
                        printBooksByPriceRange();
                        break;
                    case PRINT_ALL_AUTHOR_NAMES:
                        authorStorage.print();
                        break;
                    default:
                        System.out.println("Invalid command");

                }

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
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHOR_NAMES:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");

            }

        }

    }


    private static void initData() {
        homework.books.model.User admin = new User("admin", "admin", "admin@mail.com", "admin", UserType.ADMIN);
        userStorage.add(admin);
        Author ramchandraguha = new Author("Ramchandra", "Guha", "ram@gmail.com", gender.MALE);
        Author erichmariaremarque = new Author("Erich Maria", "Remarque", "ram@gmail.com", gender.MALE);
        Author georgebyron = new Author("George", "Byron", "ram@gmail.com", gender.MALE);
        authorStorage.add(ramchandraguha);
        authorStorage.add(erichmariaremarque);
        authorStorage.add(georgebyron);
        bookStorage.add(new Book("India After Gandhi", ramchandraguha, 5000, 3, "historical"));
        bookStorage.add(new Book("Triumphal Arch", erichmariaremarque, 8000, 5, "prose"));
        bookStorage.add(new Book("Don Juan", georgebyron, 10000, 7, "satire"));
    }


    private static void addAuthor() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input author surname");
        String authorSurname = scanner.nextLine();
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        System.out.println("Please input author gender");
        String gender = scanner.nextLine();

        Author author = new Author(authorName, authorSurname, email, gender);
        authorStorage.add(author);
        System.out.println("author created");
    }


    private static void printBooksByAuthorName() {
        try {
            bookStorage.print();
            System.out.println("Please input author name");
            String authorName = scanner.nextLine();
            bookStorage.printBooksByAuthorName(authorName);
        } catch (IllegalArgumentException e) {
            System.out.println("The book by that author name you are looking for was not found, please try again!");
            printBooksByAuthorName();
        }
    }

    private static void printBooksByGenre() {
        try {
            System.out.println("Please input genre");
            String genre = scanner.nextLine();
            bookStorage.printBooksByGenre(genre);
        } catch (IllegalArgumentException e) {
            System.out.println("The book by that genre you are looking for was not found, please try again!");
        }
    }

    private static void printBooksByPriceRange() {
        try {
            bookStorage.print();
            System.out.println("please input price range");
            System.out.println("please input minimum price");
            double minPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("please input maximum price");
            double maxPrice = Double.parseDouble(scanner.nextLine());
            bookStorage.printBooksByPriceRange(minPrice, maxPrice);
        } catch (NumberFormatException e) {
            System.out.println("The book you are looking for in that price was not found, please try again");
            printBooksByPriceRange();
        }

    }


    private static void addBook() {
        if (authorStorage.getSize() != 0) {
            authorStorage.print();
            System.out.println("Please choose author index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("Please choose correct index!!!");
                addAuthor();
            } else {
                System.out.println("Please input book's title");
                String title = scanner.nextLine();
                System.out.println("Please input book's authorName");
                System.out.println("Please input book's price");
                System.out.println("Please input book's count");
                System.out.println("Please input book's genre");
                String genre = scanner.nextLine();

                int count = Integer.parseInt(scanner.nextLine());
                double price = Double.parseDouble(scanner.nextLine());


                if (genre != null) {
                    genre = genre.trim();
                }


                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("book created");

            }
        }

    }
}

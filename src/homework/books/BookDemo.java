package homework.books;


import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;


public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {

        Author ramchandraguha = new Author("Ramchandra", "Guha", "ram@gmail.com", "MALE");
        Author erichmariaremarque = new Author("Erich Maria", "Remarque", "ram@gmail.com", "MALE");
        Author georgebyron = new Author("George", "Byron", "ram@gmail.com", "MALE");
        authorStorage.add(ramchandraguha);
        authorStorage.add(erichmariaremarque);
        authorStorage.add(georgebyron);
        bookStorage.add(new Book("India After Gandhi", ramchandraguha, 5000, 3, "historical"));
        bookStorage.add(new Book("Triumphal Arch", erichmariaremarque, 8000, 5, "prose"));
        bookStorage.add(new Book("Don Juan", georgebyron, 10000, 7, "satire"));

        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command = Integer.parseInt(scanner.nextLine());
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


    private static void addAuthor() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input author surname");
        String authorSurname = scanner.nextLine();
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        System.out.println("Please input author gender");
        String gender = scanner.nextLine();

        Author author = new Author(authorName, authorSurname, email, "MALE, FEMALE");
        authorStorage.add(author);
        System.out.println("author created");
    }


    private static void printBooksByAuthorName() {
        bookStorage.print();
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName);
    }

    private static void printBooksByGenre() {
        System.out.println("Please input genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByPriceRange() {
        bookStorage.print();
        System.out.println("please input price range");
        System.out.println("please input minimum price");
        double minPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("please input maximum price");
        double maxPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(minPrice, maxPrice);
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
            StringBuilder authorName = new StringBuilder(author.getName().trim() + " " + author.getSurname().trim());
        }

    }
}

package homework.books;


import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BooksStorage booksStorage = new BooksStorage();

    public static void main(String[] args) {

        booksStorage.add(new Book("India After Gandhi", "Ramchandra Guha", 5.000, 3, "historical"));
        booksStorage.add(new Book("Triumphal Arch", "Erich Maria Remarque", 8.000, 5, "prose"));
        booksStorage.add(new Book("Don Juan", "Jorj Byron", 10.000, 7, "satire"));

        boolean run = true;
        while (run) {
            System.out.println("please input " + EXIT + " for exit");
            System.out.println("please input " + ADD_BOOK + " for add book");
            System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
            System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
            System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    booksStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    System.out.println("Books count" + booksStorage.getSize());
                    break;
                default:
                    System.out.println("Invalid command");

            }

        }


    }


    private static void printBooksByAuthorName() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        booksStorage.printBooksByAuthorName(authorName);
    }

    private static void printBooksByGenre() {
        System.out.println("Please input genre");
        String genre = scanner.nextLine();
        booksStorage.printBooksByGenre(genre);
    }

    private static void printBooksByPriceRange() {
        System.out.println("Please input price");
        Double price = Double.parseDouble(scanner.nextLine());
        booksStorage.printBooksByPriceRange(price);
    }


    private static void addBook() {
        System.out.println("Please input book's title");
        String title = scanner.nextLine();
        System.out.println("Please input book's authorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input book's price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input book's count");
        String countStr = scanner.nextLine();
        System.out.println("Please input book's genre");
        String genre = scanner.nextLine();

        int count = Integer.parseInt(countStr);
        double price = Double.parseDouble(priceStr);


        if (authorName != null) {
            authorName = authorName.trim();
        }

        if (genre != null) {
            genre = genre.trim();
        }


        Book book = new Book(title, authorName, price, count, genre);
        booksStorage.add(book);
        System.out.println("book created");

    }
}

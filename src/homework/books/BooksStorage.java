package homework.books;

public class BooksStorage {

    private Book[] array = new Book[10];
    private int size = 0;


    public void add(Book book) {
        if (array.length == size) {
            extend();
        }
        array[size++] = book;

    }

    private void extend() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    public void printBooksByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
                break;

            }
        }
        System.out.println("The book you were looking for was not found");
    }

    public void printBooksByAuthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                System.out.println(array[i]);
                break;
            }
        }
        System.out.println("The book you were looking for was not found");
    }

    public void printBooksByPriceRange(Double price) {
        for (int i = 0; i < size; i++) {
            if (price.equals(array[i].getPrice())){
                System.out.println(array[i]);
            }
        }
        System.out.println("The book you were looking for was not found");
    }

    public int getSize() {
        return size;
    }
}

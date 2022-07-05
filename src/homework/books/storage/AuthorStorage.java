package homework.books.storage;

import homework.books.BookDemo;
import homework.books.model.Author;

public class AuthorStorage {

    private Author[] array = new Author[10];
    private int size = 0;


    public void add(Author author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;

    }

    public int getSize() {

        return size;
    }


    private void extend() {
        Author[] temp = new Author[array.length + 10];
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


    public void addGender(String MALE, String FEMALE) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGender() != null && array[i].getGender().equals(MALE)) {
                System.out.println("please choose " + 1 + " for input MALE");
            } else if (array[i].getGender() != null && array[i].getGender().equals(FEMALE)) {
                System.out.println("please choose " + 2 + " for input FEMALE");
            } else {
                System.out.println("null");

            }

        }
    }

    public Author getAuthorByIndex(int authorIndex) {
        if (authorIndex < 0 || authorIndex >= size) {
            return null;
        }
        return array[authorIndex];
    }
}

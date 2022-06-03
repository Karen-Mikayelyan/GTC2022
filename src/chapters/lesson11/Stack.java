package chapters.lesson11;

public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is fully.");
        } else {
            stck[++tos] = item;

        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        } else {
            return stck[tos--];
        }

    }
}

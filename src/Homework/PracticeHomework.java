package Homework;

public class PracticeHomework {

    // փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    long convert(int minutes) {
        int seconds = 60 * minutes;
        return seconds;
    }

    // ընդունել տարին, վերադարձնել օրերի քանակը
    int calAge(int years) {
        int days = 365 * years;
        return days;
    }

    // վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return number + 1;
    }

    // վերադարձնել true, եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    // վերադարձնել true, եթե թիվը փոքր կամ հավասար է 0 -ին։
    // մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else {
            return false;
        }
    }

    // վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    boolean reverseBool(boolean value) {
        if (!value) {
            return true;
        } else {
            return false;
        }
    }


    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            int maxLength = array1.length;
            return maxLength;
        } else {
            int maxLength = array2.length;
            return maxLength;
        }
    }
}

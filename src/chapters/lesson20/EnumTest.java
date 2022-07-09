package chapters.lesson20;

public class EnumTest {

    public static void main(String[] args) {
        String genderStr = "female3";
        try {
            Gender gender = Gender.valueOf(genderStr.toUpperCase());
            System.out.println(gender);
        } catch (IllegalArgumentException e) {
            System.out.println("Please input correct gender");
        }
    }
}

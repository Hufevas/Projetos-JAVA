import java.util.Random;

public class random {
    public static void main(String[] args) {

        Random random = new Random();

        boolean isCara;

        isCara = random.nextBoolean();

        if (isCara) {
            System.out.println("Cara");
        }
        else {
            System.out.println("Coroa");
        }


    }
}

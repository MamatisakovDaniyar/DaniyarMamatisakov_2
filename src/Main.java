 import java.util.Random;
public class Main {
    public static String permission(int personsAge, int temperature) {
        if ((personsAge >= 20 && personsAge <= 45 && temperature >= -20 && temperature <= 30
                || (personsAge < 20 && temperature >= 0 && temperature <= 28) ||
                personsAge > 45 && temperature >= -10 && temperature <= 25))
            return "\nМожно идти гулять";
           else return "\nОстовайтесь дома  ";
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt( 120);
    }
    public static void main(String[] args) {
        for (int i = 0; i<5; i++) {
            int randomAge = generateRandomAge();
            int randomTemperature =new Random().nextInt(51) - 20;
            System.out.println("Возраст:"+ randomAge + " Температура: " + randomTemperature
                    + permission(randomAge, randomTemperature));
        }
    }

}
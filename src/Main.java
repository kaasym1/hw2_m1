import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), generateRandomTemperature()));
        System.out.println(permission(generateRandomAge(), generateRandomTemperature()));
        System.out.println(permission(generateRandomAge(), generateRandomTemperature()));
        System.out.println(permission(generateRandomAge(), generateRandomTemperature()));
        System.out.println(permission(generateRandomAge(), generateRandomTemperature()));
    }

    public static String permission(int age, int temperature) {
        if (age >= 20 && age >= 45 && temperature >= -20 && temperature >= 30) {
            return "Можно идти гулять";
        } else if (age <= 20 && temperature <= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature >= 20) {
            return "Можно идти гулять";
        } else {
            return "Отавайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(101);
        return age;
    }

    public static int generateRandomTemperature(){
        Random random = new Random();
        int temperature = random.nextInt(45);
        return temperature;
    }
}
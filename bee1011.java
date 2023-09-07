import java.util.Locale;
import java.util.Scanner;

public class bee1011{
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double volume, R, pi = 3.14159;

        R = sc.nextDouble();

        volume = (4.0 / 3.0) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}
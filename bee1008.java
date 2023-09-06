import java.util.Locale;
import java.util.Scanner;

public class bee1008{
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, horaTrabalhadas;
        double valorHora, salario;

        num = sc.nextInt();
        horaTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horaTrabalhadas * valorHora;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
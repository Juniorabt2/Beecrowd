import java.util.Scanner;

public class bee1018{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N, quociente, resto, nota; 
        
        N = sc.nextInt();
        System.out.println(N);

        resto = N;

        nota = 100;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de " + nota + ",00");
        resto = resto % nota;
        
        nota = 50;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de " + nota + ",00");
        resto = resto % nota;

        nota = 20;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de " + nota + ",00");
        resto = resto % nota;

        nota = 10;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de " + nota + ",00");
        resto = resto % nota;

        nota = 5;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de " + nota + ",00");
        resto = resto % nota;

        nota = 2;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de " + nota + ",00");
        resto = resto % nota;

        nota = 1;
        System.out.println(resto + " nota(s) de 1,00");

        sc.close();

    }
}
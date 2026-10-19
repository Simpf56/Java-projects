import java.util.Scanner;

public class LV1_6 {
    public int a;
    public int b;
    public int suma;
    private Scanner sc = new Scanner(System.in);

    public void UpisBroja(){
        System.out.println("Testni podatci:");
        System.out.println("Input first number: ");
        a = sc.nextInt();
        System.out.println("Input second number: ");
        b = sc.nextInt();
    }

    public int Zbroji(){
        suma = a + b;
        return suma;
    }

    public int Oduzmi(){
        suma = a - b;
        return suma;
    }

    public int Pomnozi(){
        suma = a * b;
        return suma;
    }

    public int Podijeli(){
        suma = a / b;
        return suma;
    }

    public int Modulo(){
        suma = a % b;
        return suma;
    }




}

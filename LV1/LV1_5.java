import java.util.Scanner;

public class LV1_5 {
    private int broj;
    public int a;
    public int b;
    public int suma;
    private Scanner sc = new Scanner(System.in);

    public int Funkcija(){
        broj = sc.nextInt();   
        return broj;     
    }

    public int Funkcija(int a,int b){
        suma = a * b;
        return suma;
    }
}

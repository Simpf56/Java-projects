public class Main{

    public static void main(String[]args){
        //1.zadatak
        LV1_1 obj1 = new LV1_1();

        obj1.Funkcija();
        //2.zadatak
        LV1_2 obj2 = new LV1_2();
        obj2.Funkcija();
        
        //3.zadatak
        LV1_3 obj3 = new LV1_3();
        System.out.println("Testni podatci:");
        System.out.println(obj3.a + " + " + obj3.b);
        System.out.println("Ocekivani izlaz:");
        obj3.Funkcija();

        //4.zadatak
        LV1_4 obj4 = new LV1_4();
        System.out.println("Testni podatci:");
        System.out.println(obj4.a + " / " + obj4.b);
        System.out.println("Ocekivani izlaz:");
        obj4.Funkcija();

        //5.zadatak
        LV1_5 obj5 = new LV1_5();
        
        System.out.println("Testni podatci:");
        System.out.println("Unesite prvi broj: ");
        obj5.a = obj5.Funkcija();
        System.out.println("Unesite drugi broj: ");
        obj5.b = obj5.Funkcija();
        System.out.println("Ocekivani izlaz:");
        obj5.suma = obj5.Funkcija(obj5.a,obj5.b);
        System.out.println(obj5.suma);

        //6.zadatak
        LV1_6 obj6 = new LV1_6();        
        obj6.UpisBroja();
        System.out.println(obj6.Zbroji());
        System.out.println(obj6.Oduzmi());
        System.out.println(obj6.Pomnozi());
        System.out.println(obj6.Podijeli());
        System.out.println(obj6.Modulo());

        
        
        
        


        






    }
}


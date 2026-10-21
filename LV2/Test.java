package LV2;

public class Test {

    public static void main(String[]args){
        Zarulja z1 = new Zarulja(); 
        z1.PritisniPrekidac();
        z1.Provjeri();

        Zaposlenik Miro = new Zaposlenik(20, 70, 2300);
        Miro.Dohvati();
        System.out.println(Miro.UkupnaZarada());
        System.out.println(Zaposlenik.UkupnaZarada(Miro));

    }
}


/*BONUS: Napravi klasu “Test” u istom paketu. Kreirajte objekt tipa “Zarulja” i isprobajte rad. 
Kreirajte objekt tipa “Zaposlenik” i isprobajte rad obje metode za izračun place zaposlenika. */
package LV2;

public class Main {
    public static void main(){
        //1.zadatak
        Zarulja Osram = new Zarulja();

        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();

        //2.zadatak
        Zaposlenik zaposlenik = new Zaposlenik(15, 65, 1200.00);
        zaposlenik.Dohvati();

        System.out.printf("Zarada bez static: %.2f eura%n", zaposlenik.UkupnaZarada());
        System.out.printf("Zarada sa static: %.2f eura%n", Zaposlenik.UkupnaZarada(zaposlenik));


        
    }

}



/*Napiši klasu „Zaposlenik“ koja ima privatne podatkovne članove „staz“, „starost“ i „placa“.
Napiši konstruktor koji inicijalizira podatkovne članove prilikom stvaranja objekta. Napiši
pristupne metode kojima se mogu promijeniti podatkovni članovi kao i metode kojima se
može dobiti njihova vrijednost. Napiši 2 metode koje računaju koliko je do sada zaradio
zaposlenik. Jedna metoda ne prima nikakav parametar pri pozivu nego računa sa podacima
objekta koji ju poziva, a druga metoda je statična i prima referencu na objekt klase Zaposlenik
za koji onda radi izračun. Obje metode računaju koliko je zaposlenik ukupno zaradio za
vrijeme rada (mjeseci broj godina staža mjesečna plaća). */
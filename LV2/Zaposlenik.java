package LV2;

public class Zaposlenik {
    private int staz;
    private int starost;
    private double placa;

        /**
     * Stvara novog zaposlenika.
     * @param staz broj godina staža
     * @param starost starost u godinama
     * @param placa mjesečna plaća
     */
    Zaposlenik(int a,int b,double c){
        staz = a;
        starost = b;
        placa = c;
    }

    public void Dohvati(){
        System.out.println("Zaposlenika ima "+ staz + " godina staza.");
        System.out.println("Zaposlenika je "+ starost + " godina star.");
        System.out.printf("Zaposlenik zaraduje = %.2f eura%n", placa);
    }

    public void PromjeniStaz(int a){
        staz = a;
    }

    public void PromjeniStarost(int b){
        starost = b;
    }

    public void PromjeniPlacu(double c){
        placa = c;
    }

    public double UkupnaZarada(){
        return 12*placa*staz;
    }

    public static double UkupnaZarada(Zaposlenik x){
        return 12*x.placa*x.staz;
    }

    
}

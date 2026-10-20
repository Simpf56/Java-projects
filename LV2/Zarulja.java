package LV2;

public class Zarulja {
    private boolean Stanje;

    Zarulja(){
        Stanje = false;
    }

    public void PritisniPrekidac(){
        if(Stanje == false){
            Stanje = true;
        }
        else{
            Stanje = false;
        }
    }

    public void Provjeri(){
        if(Stanje == false){
            System.out.println("Mrak je.");
        }else{
            System.out.println("Svijetli.");
        }
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
enum stare{
    achizitionat,
    expus,
    vandut
}

enum ModTipar{
    color,
    albnegru
}

class Echipament{
    private String denumire;
    private int nrInventar;
    private int pret;
    private String zona;
    private int ppm;
    private stare s;

    public Echipament(String denumire, int nrInventar, int pret, String zona, int ppm, stare s) {
        this.denumire = denumire;
        this.nrInventar = nrInventar;
        this.pret = pret;
        this.zona = zona;
        this.ppm = ppm;
        this.s = s;
    }
    public String toString() {
        return ("Denumire: " + denumire + "\nNumar inventar: " + nrInventar + " \nPret: " + pret + "\nZona: " + zona + "\nPpm: " + ppm + "\nEchipament: " + s);
    }
}
class Imprimanta extends Echipament {
    private int nrPagini;
    private int rezolutie;
    private ModTipar modTipar;

    public Imprimanta(String denumire, int nrInventar, int pret, String zona, int ppm, stare s, int rezolutie, int nrPagini, ModTipar modTipar) {
        super(denumire, nrInventar, pret, zona, ppm, s);
        this.rezolutie = rezolutie;
        this.nrPagini = nrPagini;
        this.modTipar = modTipar;
    }

    public String toString() {
        return (super.toString() + "\nRezolutie:" + rezolutie + "\nNumar pagini: " + nrPagini + "" + "\nMod tiparire" + modTipar);
    }

}

class Copiatoare extends Echipament {
    private int toner;
    private String format;

    public Copiatoare(String denumire, int nrInventar, int pret, String zona, int ppm, stare s, int toner, String format) {
        super(denumire, nrInventar, pret, zona, ppm, s);
        this.toner = toner;
        this.format=format;
    }

    public String toString() {
        return (super.toString() + "\nToner:" + toner + "\nFormat:" + format);
    }

}

class SistemeDeCalcul extends Echipament {
    private String tipMonitor;
    private int vitProcesor;
    private int capacitate;

    public SistemeDeCalcul(String denumire, int nrInventar, int pret, String zona, int ppm ,stare s, String tipMonitor, int vitProcesor, int capacitate) {
        super(denumire, nrInventar, pret, zona, ppm,s);
        this.tipMonitor = tipMonitor;
        this.vitProcesor = vitProcesor;
        this.capacitate = capacitate;
    }

    public String toString() {
        return (super.toString() + "\nTip monitor:" + tipMonitor + "\nViteza procesor: " + vitProcesor + "\nCapacitate: " + capacitate);
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        List<Echipament> echipament = new ArrayList<Echipament>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("src/echipamente.txt")));
        String s;
        int n = 0;
        while ((s = buffer.readLine()) != null) {
            String[] x = s.split(";");
            int nr_inv = Integer.parseInt(x[1]);
            int pret = Integer.parseInt(x[2]);
            stare situatie = stare.valueOf(x[4]);
            if (s.contains("imprimanta")) {
              //  Imprimanta i1=new Imprimanta();

            }
        }
    }
}
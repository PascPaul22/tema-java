package lab2;
import java.util.Scanner;

public class ex3 {
	int nr = 0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti primul string-ul: ");
        String input = scan.nextLine();
        System.out.println("Introduceti string-ul ce va fi inserat: ");
        String input2 = scan.nextLine();
        StringBuilder sb = new StringBuilder(input2);
        sb.insert(0,input);
        System.out.println("Sirul inainte de stergere: " + sb.toString());
        System.out.println("Introduceti pozitia de la care se sterge: ");
        int pozitieStart = scan.nextInt();
        System.out.println("Introduceti nr de caractere ce o sa fie sterse: ");
        int nrCaractere = scan.nextInt();
        sb.delete(pozitieStart,pozitieStart+nrCaractere);
        System.out.println("String-ul nou este: " + sb.toString());
	}

}

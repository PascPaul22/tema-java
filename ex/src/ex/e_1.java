package ex;

import java.util.Scanner;

public class e_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("lungime= ");
        int lungime = scanner.nextInt();
        
        System.out.println("latime= ");
        int latime = scanner.nextInt();

        int perimetru = 2 * lungime + 2 * latime;
        int arie = lungime * latime;

        System.out.println("Perimetrul= "+perimetru);
        System.out.println("Aria= "+arie);
        scanner.close();

	}

}

package ex;
import java.util.Scanner;
public class e3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt(),ok=1;
        System.out.println("verificare daca numarul introdus este prim: ");
        if(n<=1 || n%2==0 && n!=2)
        	ok=0;
        for(int i = 3; i*i <= n; i=i+2)
            if(n % i == 0)
            	ok=0;
        if(ok==1)
        {
        	System.out.println("Numarul este prim, iar divizorii lui sunt: ");
	    	for(int div = 1; div<=n; div++)
	            if(n % div==0)
	            	System.out.println(" "+div);
        }
        else
        	System.out.println("Numarul nu este prim");
	}

}

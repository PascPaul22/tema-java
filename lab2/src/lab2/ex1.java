package lab2;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ex1 {

	public static void main(String[] args) {
		String nume_fis= "lab2/src/lab2/judete.in";
        BufferedReader flux_in;
        int contor = 0;
        final int n = 42;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
        String []judete = new String[n];

        for(int index = 0;index<judete.length;index++)
        {
            judete[index] = flux_in.readLine();
            if(judete[index] == null) break;
            contor++;
        }
        Arrays.sort(judete,0,contor);
        for(int index = 0;index < judete.length && judete[index]!=null;index++) {
            System.out.println(judete[index]);
        }

	}

}

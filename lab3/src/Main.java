import java.io.*;
import java.util.*;
import java.io.FileInputStream.*;

class Punct
{
    private double x,y;
    public Punct(double x, double y)
    {
        this.x = x;
        this.y= y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }
}

class Parabola
{
    double a, b, c;
    public Parabola(double a, double b,double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void afisare()
    {
        System.out.println("f(x)= " + this.a + "x^2+" + this.b + "x+" + this.c + "");
    }

    public Punct calcul_coord_vf (Parabola p)
    {
        double x_vf = -(p.b/(2*p.a));
        double y_vf = (-(p.b*p.b)+4*p.a*p.c)/(4*p.a);
        Punct varf = new Punct(x_vf, y_vf);
        return varf;
    }

    public static void mijl_segm (Parabola p1, Parabola p2)
    {
        Punct vf1 = p1.calcul_coord_vf(p1);
        Punct vf2 = p2.calcul_coord_vf(p2);
        System.out.println("Coord mijl segm: (" + (vf1.getX() + vf2.getX())/2 + ", " + (vf1.getY() + vf2.getY())/2 + ")");
    }
}

class MainApp
{

    public static void main(String[]args) throws FileNotFoundException {
        String nume_fis= "D:\\lucru_java_intellij\\lab3\\src\\in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
        Parabola p1 = new Parabola(1, 2, 3);
        Parabola p2 = new Parabola(4, 5, 6);
        System.out.println("functiile sunt: ");
        p1.afisare();
        p2.afisare();
        p1.calcul_coord_vf(p1);
        p2.calcul_coord_vf(p2);
        Parabola.mijl_segm(p1, p2);
    }
}
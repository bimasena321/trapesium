import java.util.Scanner;
public class trapesium{
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        double hasil;
        int vv;

        Scanner v = new Scanner(System.in);
        System.out.println("a: ");
        a = v.nextDouble();
        System.out.println("b: ");
        b = v.nextDouble();
        System.out.println("c: ");
        c = v.nextDouble();

        hasil = (a + c) / 2 * b;
        vv = (int)hasil;
        System.out.println("hasil: "+vv);
    }
}
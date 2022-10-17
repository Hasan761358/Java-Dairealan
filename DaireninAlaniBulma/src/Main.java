import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double yaricap, alan, cevre, pi=3.14, merkezacı,dairedilimialan;

        Scanner scanner=new Scanner(System.in);

        // alan ve çevre bulma.

        System.out.print(" Yarıçapı girin : ");
        yaricap=scanner.nextDouble();
        alan = yaricap*yaricap*pi;
        cevre=2*pi*yaricap;
        System.out.println(" Alan : "+alan);
        System.out.println(" Çevre : " + cevre);
        System.out.println("------------------------------------");

        // Daire diliminin alanını bulma

        System.out.println(" Merkez açi : ");
        merkezacı=scanner.nextDouble();
        dairedilimialan=(pi*(yaricap*yaricap)*merkezacı)/360;
        System.out.println(" Daire diliminin alanı : " + dairedilimialan);
    }
}
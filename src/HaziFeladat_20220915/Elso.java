package HaziFeladat_20220915;

import java.util.Scanner;

public class Elso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a medence átmérőjét: ");
        double atmero = sc.nextDouble();
        System.out.print("Adja meg a medence mélységét: ");
        double melyseg = sc.nextDouble();
        double sugar = atmero/2;
        double terulet = sugar*sugar*Math.PI;
        double terfogat = terulet*melyseg;
        System.out.printf("A medencébe %.2f köbméter víz fér.", terfogat);
    }
}

package HaziFeladat_20220915;

import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív számot:");
        double szam = sc.nextDouble();

        System.out.println("A szám a(z) " + Math.round(Math.floor(szam)) + "és a(z) " + Math.round(Math.ceil(szam)) + " között van, és a " + Math.round(szam) + " számhoz van közelebb.");

    }
}
package HaziFeladat_20220915;

import java.util.Random;
import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int randomSzam = rand.nextInt(99) + 1;
        int tippDbSzam = 1;

        System.out.println("Tippeljen 1 és 100 között: ");
        int tipp = sc.nextInt();

        while (tipp != randomSzam){

            if (tipp > randomSzam){
                System.out.println("A random szám kisebb!");
                System.out.println("Tippeljen újra  1 és 100 között: ");
                tipp = sc.nextInt();
            }
            else if (tipp < randomSzam){
                System.out.println("A random szám nagyobb!");
                System.out.println("Tippeljen újra  1 és 100 között: ");
                tipp = sc.nextInt();
            }
            tippDbSzam++;
        }
        System.out.println("A random szám " + randomSzam + " volt! Ön " + tippDbSzam + "db tippelés után találta el!");

    }
}

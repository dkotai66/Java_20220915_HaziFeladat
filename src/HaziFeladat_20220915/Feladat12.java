package HaziFeladat_20220915;

import java.util.Scanner;


public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adjon meg egy számot 1 és 1000 között:");
        int osszeg = sc.nextInt();
        int kettoszaz = 0;
        int szaz = 0;
        int husz = 0;
        int otven = 0;
        int tiz = 0;
        int ot = 0;

        if (osszeg > 1000 || osszeg < 1){
            System.out.println("A megadott érték nem megfelelő!");

        } else {
            while (osszeg>=200){
                osszeg-=200;
                kettoszaz++;
            }
            while (osszeg>=100){
                osszeg-=100;
                szaz++;
            }
            while (osszeg>=50){
                osszeg-=50;
                otven++;
            }
            while (osszeg>=20){
                osszeg-=20;
                husz++;
            }
            while (osszeg>=10){
                osszeg-=10;
                tiz++;
            }
            while (osszeg>=5){
                osszeg-=5;
                ot++;
            }
            System.out.println("Érmék: 200ft-os: " + kettoszaz + "db, 100ft-os:" + szaz + "db, 50ft-os:" + otven + "db, 20ft-os: " + husz + "db, 10ft-os: " + tiz + "db, 5ft-os: " + ot + "db.");
        }


    }
}

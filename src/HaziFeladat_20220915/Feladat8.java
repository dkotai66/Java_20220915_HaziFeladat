package HaziFeladat_20220915;

import java.util.Scanner;


public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fej vagy írás? (0) fej, (1) írás: ");
        int tipp = sc.nextInt();
        int gepDobas = (int)(Math.random()*2);
        System.out.printf("A dobás eredménye: %s\n", gepDobas == 0 ? "fej" : "írás");
        if(tipp==gepDobas){
            System.out.println("Gratulálok, nyert");
        }
        else {
            System.out.println("Sajnos nem nyert, próbálkozzon újra");
        }
    }
}

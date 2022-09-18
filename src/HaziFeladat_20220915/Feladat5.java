package HaziFeladat_20220915;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a téglalap 'a' oldalát: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem a téglalap 'b' oldalát: ");
        double b = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Kérek egy betűt k-kerület, t-terület: ");
        String betu = sc.nextLine();
        if (betu.equals("k")){
            double kerulet = 2*(a+b);
            System.out.printf("A téglalap kerülete %f centiméter\n", kerulet);
        }
        else if(betu.equals("t")){
            double terulet = a*b ;
            System.out.printf("A téglalap területe %.2f négyzetcentiméter\n", terulet);
        }
        else {
            System.out.println("Hibás betűt adott meg.");
        }
        if(a==b){
            System.out.println("Ez egy négyzet.");
        }
    }
}

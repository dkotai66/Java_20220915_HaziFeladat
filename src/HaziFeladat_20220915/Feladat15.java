package HaziFeladat_20220915;

import java.util.Random;


public class Feladat15 {
    public static void main(String[] args) {
        int[] szamok=new int[25];
        for (int i=0; i<szamok.length;i++){
            szamok[i]=i+1;
            if (szamok[i]%2!=0){
                System.out.println(Math.pow(szamok[i],2));
            }
        }
    }
}

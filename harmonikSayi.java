package Giris;
import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        double [] myList = {1, 2, 3, 4, 5} ;
        double series = 0 ;

        for (int i = 0 ; i < myList.length ; i++) {

            series += (1 / myList[i]) ;
        }

        double average = (myList.length/series);

        System.out.println("Dizideki sayıların Harmonik ortalaması : " + average);



    }






    }


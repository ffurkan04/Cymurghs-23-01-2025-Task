package com.furkanyaman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
          *         0
         ***        1
        *****       2
       *******      3
      *********     4
         */
        System.out.println("Please enter line number"); 
        Scanner keyboard = new Scanner(System.in);
        int lineNumber = keyboard.nextInt();
        
        
         for(int line = 0; line <lineNumber; line++){
 /*yukarıdaki şekle göre satır arttıkça boşluk azalıyor. 
 Bunu da girilen satır sayısı - döngünün bulunduğu satır olarak hesaplanabiliyor.
 */
             for(int space=0 ; space<lineNumber-(line);space++){
                 System.out.print(" ");
             }
 /*ln.7-13 yorum satırındaki şemaya göre her satırda satır numarasının 2 katının 1 fazlası yıldız var. 
 yıldız sayısı bunu geçmemesi gerektiği için ln.23 de küçüktür işareti kullanıyoruz.
 Örn. ln. 1 için 1 +(1*2) = 3 olacak şekilde 3 kez çalışır ve 3 tane * koyar. */
             for(int star= 0; star<1+(line*2); star++){ 
                 System.out.print("*");
             }
             System.out.println();

         }


        //Ters piramit

        /*
          ********* 0   Satır numarası = 0 yapıp arttırırsak düz piramit
           *******  1   Satır numarası =istenilen satır yapıp azaltırsak ters piramit olur.
            *****   2   
             ***    3   Boşluk= istenilen satır - satır numarası
              *     4
         */
        //Not terste satır numarası yaparken istenilen satırı -1 yapmazsan döngü 1 defa fazla çalışır. 

       for(int line = lineNumber-1; line>=0; line--){
        for(int space= 0; space<lineNumber-line; space++){
            System.out.print(" ");
        }
        for(int star = 0; star<1+(line*2); star++){
            System.out.print("*");
        }
        System.out.println(); // satır atlamak için
       }
    }
}
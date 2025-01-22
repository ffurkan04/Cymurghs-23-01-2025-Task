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
//ln.7-13 yorum satırındaki şemaya göre her satırda satır numarasının 2 katının 1 fazlası yıldız var. 
//yıldız sayısı bunu geçmemesi gerektiği için ln.22 de küçüktür işareti kullanıyoruz.
//Örn. ln. 1 için 1 +(1*2) = 3 olacak şekilde 3 kez çalışır ve 3 tane * koyar. 
            for(int star= 0; star<1+(line*2); star++){ 
                System.out.print("*");
            }

        }
    }
}
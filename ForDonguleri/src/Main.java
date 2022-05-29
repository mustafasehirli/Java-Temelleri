
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       
       /* for (baslatma ; kosul ; artırma veya azaltma işlemleri) {
            Döngü koşulumuz doğru olduğu sürece burası çalışacak.
        
        }*/
        
        
       
      int i;
       
       for (i = 0; i < 5 ; i++) {
           
           System.out.println("i = " + i);
           
       } 
      
       
      for (int a = 0; i < 5 ; i++) {
          System.out.println("a = " + a);
          
      } 
     
    for (int a = 10 ; a >= 0 ; a--) {
         
         System.out.println("a = " + a);
         
     }
     
     int c = 0;
     
     for(; c < 5 ;c++) {
         System.out.println("Java Öğreniyorum...");
     }
     
     int x = 0;
     int j = 10;
     
     for (; x < 10 && j > 0; x++,j--){
         
         System.out.println("x = " + x);
         System.out.println("j = " + j);
     }
     
     for (int b = 2 ; b < 100 ; b *= 2){
         System.out.println("b = " + b);
     }
     //5! = 5 4 3 2 1
     
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Bir sayı giriniz:");
     
     int faktoriyel = 1;
     
     int sayi = scanner.nextInt();
     
     for (int y = 1; y <= sayi;y++) {
         
         faktoriyel *= y;
         System.out.println("Faktoriyel = " + faktoriyel + " y = " + y);
         
     }
        System.out.println("Faktöriyel = " + faktoriyel);
        
    } 
}    
    
    
      
               
               
       
       
       
       
       
      
      
          
     
        
        
       
    
}
}

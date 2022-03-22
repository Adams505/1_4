import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Witaj w kalkulatorze, wybierz funkcje:1-4");
    int a = scan.nextInt();
    
    switch(a)
      {

        case 1:
         int wynik=1;
          int i;
          int b=1;
          wynik=b;
          
          System.out.println("Wybrales potegowanie, podaj podstawe b");
          b = scan.nextInt();
          System.out.println("podaj potege c");
          int c = scan.nextInt();
          for(i=0;i<c+1;i++)
            
          System.out.println(wynik);
          break;
            
        case 2:
        double e;
          double d;
          System.out.println("Wybrales sume pierwiastkow, podaj a");
          a = scan.nextInt();
          System.out.println("podaj b");
           b = scan.nextInt();
          d= Math.sqrt(a);
          e= Math.sqrt(b);
          System.out.println(d+e);
          break;
          
        case 3:
          break;
        case 4:
          break;

        

          
      }
  }
}
package my.home.firstLevel.cycle;

import java.util.Scanner;

/*Вычислить значения функции на отрезке [а,b] c шагом h*/
public class for2 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();
        
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
            	System.out.print(i + " ");
            } else {
            	System.out.print(-i + " ");
            }
        }
    }
    
}

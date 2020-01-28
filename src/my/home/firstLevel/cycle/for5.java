package my.home.firstLevel.cycle;

import java.util.Scanner;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. */
public class for5 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double e = scanner.nextDouble();
        double sum = 0;
        int i = 0;
        double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
        scanner.close();
        
        while (Math.abs(a) >= e){
            sum += a;
            i++;
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
        }
        System.out.println(sum);
    }
    
}

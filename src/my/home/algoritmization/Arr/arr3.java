package my.home.algoritmization.Arr;


public class arr3 {
    public static void main(String[] args) {
        double[] mas = {-1.5465,-74879,0,465.2,55.2154,0,-0.24546};
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0 ) pos++;
            else if(mas[i] < 0) neg++;
            else zero++;
        }
        System.out.println("pos: " + pos + " neg: " + neg + " zero: " + zero);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №8");

        System.out.println("Задание №1");
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        System.out.println("Задание №2");
        for( int a = 10; a > 0; a = a - 1) {
            System.out.println(a);
        }

        System.out.println("Задание №3");
        for ( int q = 0; q <= 17; q = q + 2) {
            System.out.println(q);
        }

        System.out.println("Задание №4");
        for (int w = 10; w >= -10; w = w -1) {
            System.out.println(w);
        }

        System.out.println("Задание №5");
        for ( int y = 1904; y <= 2096; y = y + 4 ) {
            System.out.println( y + "год является высокосным" );
        }

        System.out.println("Задание №6");
        for ( int r = 7; r <= 98; r = r + 7) {
            System.out.println(r);
        }

        System.out.println("Задание №7");
        for ( int t = 1; t <= 512; t = t * 2) {
            System.out.println(t);
        }

        System.out.println("Задание №8");
        int capital = 29000;
        int total = 0;
        for ( int n = 0; n < 12; n = n + 1) {
            total = total + capital;
            System.out.println(" Месяц " + n + " сумма накоплений составляет " + total + " рублей");
        }

        System.out.println("Задание №9");
        int capital2 = 29000;
        int total2 = 0;
        for ( int m = 0; m < 12; m = m + 1) {
            total2 = total2 + total2/100;
            total2 = total2 + capital2;
            System.out.println("Месяц " + m + " сумма накоплений составляет " + total2 + " рублей");

        }

        System.out.println("Задание №10");

        for ( int z = 1; z <= 10; z = z + 1) {
            System.out.println( z + " * 2 = " + z*2 );
        }




    }
}
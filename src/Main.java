public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        // Задание 3
        for (int a = 0; a < 17; a = a + 2) {

            System.out.println(a);
        }
        for (int c = 10; c >= -10; c --) {
            System.out.println(c);
        }
        for ( int d = 1904; d < 2096; d = d +4 ) {
            System.out.println(d);
        }
        for (int g = 7; g <= 98; g = g +7) {
            System.out.println(g);
        }
        for ( int s = 1; s <=512; s = s *2){
            System.out.println(s);
        }
   // Задание  2
        int capital = 29000;
        int deposit = 0;
        for (int e = 1; e <= 12; e++ ) {
            deposit = deposit + deposit / 100;
            deposit += capital;

            System.out.println("Месяц " + e + ", сумма накоплений равна " + deposit + " рублей");

        }
    }
}
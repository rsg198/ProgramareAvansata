public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "Php", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);

        n *= 3;  //inmultire cu 3

        n += 0b10101; //adunam numarul binar 10101 la n

        n += 0xFF; //adaugam numarul hex FF la n

        n *= 6;

        while (n > 9) {
            int m = 0;
            while (n != 0) {
                m += n % 10;
                n = n / 10;
            }
            n = m;
            m = 0;
        }
        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);

    }
}

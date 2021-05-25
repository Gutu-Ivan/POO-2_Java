package function;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Introduceti numarul: ");
            int num = scan.nextInt();

            functia f1 = new Function1();
            functia f2 = new Function2();
            functia f3 = new Function3();

            System.out.println("Prima functia: " + f1.f(num));
            System.out.println("A doua functia: " + f2.f(num));
            System.out.println("A treia functia: " + f3.f(num));
        }
    }




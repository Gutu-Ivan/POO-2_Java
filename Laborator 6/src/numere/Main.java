package numere;

import java.util.Scanner;

public class Main {
    public static boolean isPrim (int n)
    {
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void numarul () {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Introduceti numarul: ");

        int num = scan.nextInt ();

        if (isPrim (num))
        {
            int i = num + 1;

            while (true)
            {
                if (isPrim (i))
                {
                    System.out.println (i);
                    break;
                }
                i++;
            }
            return;
        }


        if (num % 2 != 0 && !isPrim (num))
        {
            System.out.println (num + 2);
            return;
        }

        if (num % 2 == 0)
        {
            System.out.println (num + 2);
        }
    }

    public static void main (String[]args) {
        numarul ();
    }

}

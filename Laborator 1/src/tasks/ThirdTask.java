package tasks;

import java.io.IOException;

public class ThirdTask implements Reader {
    public void solveIntegerVersion() {
        try {
            System.out.println(
                    "Give 5 digit number."
            );

            int number = Integer.parseInt(
                    reader.readLine()
            );

            if (String.valueOf(number).length() == 5) {
                StringBuilder result = new StringBuilder();
                int digit;
                int counter = 0;
                do {
                    digit = number % 10;
                    counter++;
                    if (counter != 3) {
                        result.append(digit);
                    }
                    number = number / 10;
                } while (number != 0);

                System.out.println(
                        result.reverse()
                );

            } else {
                System.out.println(
                        "Not 5 digit number."
                );
                solveIntegerVersion();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void solveStringVersion() {
        System.out.println(
                "Give 5 digit number."
        );

        try {
            String number =
                    reader.readLine();

            if (number.length() == 5) {
                System.out.println(
                        number.substring(0, 2)
                                + number.substring(2, number.length() - 1)
                );
            } else {
                System.out.println(
                        "Not 5 digit number."
                );
                solveStringVersion();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
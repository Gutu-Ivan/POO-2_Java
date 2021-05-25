package tasks;

import java.util.ArrayList;

public class SecondTask implements Reader {
    public void solve() {
        try {
            ArrayList<Integer> numberList =
                    readNumbers();

            System.out.println(
                    "Arythmetic average: "
                            + getArithmeticAverage(
                            numberList
                    )
            );
        } catch (Exception e) {
            System.out.println(
                    "Error: " + e
            );
        }
    }

    final ArrayList<Integer> readNumbers() {
        ArrayList<Integer> numberList = new ArrayList<>();
        int number = 5; //giving random value, it will not be added.
        do {
            try {
                System.out.println(
                        "Give number"
                );
                number = Integer.parseInt(
                        reader.readLine()
                );
                numberList.add(number);
            } catch (Exception e) {
                System.out.println(
                        "Error " + e
                );
            }
        } while (number != 0);

        return numberList;
    }

    final double getArithmeticAverage(ArrayList<Integer> values) {
        int size = values.size();
        int sum = values.stream()
                .mapToInt(Integer::valueOf)
                .sum();

        return Double.parseDouble(
                String.valueOf(sum / size)
        );
    }
}
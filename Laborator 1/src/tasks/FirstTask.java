package tasks;

import java.util.ArrayList;
import java.util.Collections;

public class FirstTask implements Reader {

    public void solve() {
        System.out.println(
                "N = "
        );
        try {
            int n = Integer.parseInt(
                    reader.readLine()); // will throw error if string
            ArrayList<Double> numberList = readNumbers(n);
            System.out.println(
                    "Min: " + getMin(numberList)
            );
        } catch (Exception e) {
            System.out.println(
                    "Error: " + e
            );
        }
    }

    final ArrayList<Double> readNumbers(int value) {
        double number;
        ArrayList<Double> numberList = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            try {
                System.out.println(
                        "Dati numarul " + i
                );
                number = Double.parseDouble(reader.readLine());
                numberList.add(number);
            } catch (Exception e) {
                System.out.println(
                        "Error: " + e
                );
            }
        }
        return numberList;
    }

    final double getMin(ArrayList<Double> numberList) {
        return Collections.min(
                numberList
        );
    }
}
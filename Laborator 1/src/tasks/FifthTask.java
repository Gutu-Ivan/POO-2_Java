package tasks;

import java.util.ArrayList;

public class FifthTask implements Reader {
    public void solve() {
        System.out.println(
                "N = "
        );
        try {
            int n = Integer.parseInt(
                    reader.readLine());

            int[] numberArray = readNumbers(n);

            showRotations(numberArray);


        } catch (Exception e) {
            System.out.println(
                    "Error: " + e
            );
        }
    }

    final int[] readNumbers(int value) {
        int number;
        int[] numberList = new int[0];
        int n = 0;
        for (int i = 0; i < value; i++) {
            try {
                System.out.println(
                        "Dati numarul " + i
                );
                number = Integer.parseInt(
                        reader.readLine()
                );
                numberList = addElem(n, numberList, number);
                n++;
            } catch (Exception e) {
                System.out.println(
                        "Error: " + e
                );
            }
        }
        return numberList;
    }

    private void showRotations(int[] values) {
        int size = values.length;
        System.out.println(
                "Rotations: "
        );
        showArr(values);
        for (int k = 0; k < size - 1; k++) {
            for (int i = 0; i < 1; i++) {
                int j, last;
                last = values[values.length - 1];
                for (j = values.length - 1; j > 0; j--) {
                    values[j] = values[j - 1];
                }
                values[0] = last;
            }
            System.out.print(", ");
            showArr(values);
        }
    }

    private void showArr(int[] values) {
        for (Integer value : values) {
            System.out.print(value + " ");
        }
    }

    private static int[] addElem(int n, int[] arr, int x) {
        int i;

        int[] newarr = new int[n + 1];

        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
}
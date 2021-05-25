package tasks;

import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

public class FourthTask implements Reader {
    public void solve() {
        Vector<Integer> valuesVector = new Vector<>();
        System.out.println(
                "Give n"
        );

        try {
            int n =
                    Integer.parseInt(
                            reader.readLine()
                    );
            valuesVector = readVector(n);

            Collections.sort(valuesVector);

            System.out.println(
                    "Result: "
                            + valuesVector.get(valuesVector.size() - 2)
                            + "/" + valuesVector.get(valuesVector.size() - 1)
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    final Vector<Integer> readVector(int n) throws IOException {
        Vector<Integer> values = new Vector<>();
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Give number"
            );
            int number =
                    Integer.parseInt(
                            reader.readLine()
                    );

            values.add(number);
        }
        return values;
    }
}
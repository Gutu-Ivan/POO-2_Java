package tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface Reader {
    BufferedReader reader =
            new BufferedReader(
                    new InputStreamReader(System.in));
}
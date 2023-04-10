package latihanloop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihannestedfor {
    public static void main(String[] s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 5; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                    }
                    System.out.println();


                }
            }
        }

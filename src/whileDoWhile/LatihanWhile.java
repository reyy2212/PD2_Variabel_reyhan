package whileDoWhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LatihanWhile {
    public static void main(String[] s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //while
        //menjumlahkan setiap angka yang dientrikan
        //kondisi pengulangan penjumlahan akan dilakukan apabila angka yang diinputkan >= 0
        //output: angka hasil jumlah
//        int number=0, jumlah=0;
//        while (number >= 0){
//            jumlah += number; //utk penjumlahan setiap angka yang diinputkan
//
//            System.out.println("Entri angka : ");
//            number = Integer.parseInt(br.readLine());
//        }
//        System.out.println("jumlah = " + jumlah);

        boolean b;
        int i = 0;
        while (i < 5){
            System.out.println("Entri nim : ");
            int nim = Integer.parseInt(br.readLine());
            System.out.println("Entri nama : ");
            String nama = br.readLine();
            i++;
        }

    }
}

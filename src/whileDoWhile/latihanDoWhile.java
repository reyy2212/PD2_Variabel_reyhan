package whileDoWhile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanDoWhile {
    public static void main(String[] s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // letakkan variabel sebelum blok try agar terbaca didalam blok try-catch
//        int nim, i = 0;
//        String nama;
//
//        try {
//            do {
//                System.out.println("Entri nim : ");
//                nim = Integer.parseInt(br.readLine());
//                System.out.println("Entri nama : ");
//                nama = br.readLine();
//                i++;
//            } while (i < 5);
//        } catch (Exception e) {
//            // kosongkan saja
//        }

        try {
            /*
             * membuat program dengan menu 1.Entri mahasiswa (nim, nama, prodi, matakuliah)
             * 2.Hitung nilai mahasiswa {uts, uas, tugas) 3.lihat rapor mahasiswa 4.keluar program
             */
            String nimMhs = null, namaMhs = null, prodi = null, matakuliah = null, cari = null;
            int uts, uas, tugas, menu, nilaiAkhir = 0;

            do {
                System.out.println("=== Program Akademik Mahasiswa ===");
                System.out.println("1.Entri mahasiswa");
                System.out.println("2.Hitung nilai mahasiswa");
                System.out.println("3.lihat rapor mahasiswa");
                System.out.println("4.keluar program");
                System.out.println("Masukkan pilihan anda : ");
                menu = Integer.parseInt(br.readLine());

                switch (menu) {
                    case 1:
                        System.out.println("=== Menu Entri Mahasiswa ===");
                        System.out.println("Entri nim");
                        nimMhs = br.readLine();
                        System.out.println("Entri nama");
                        namaMhs = br.readLine();
                        System.out.println("Entri Program Studi");
                        prodi = br.readLine();
                        System.out.println("Entri mata kuliah");
                        matakuliah = br.readLine();
                        break;
                    case 2:
                        System.out.println("===Menu Hitung Nilai Mahasiswa");
                        //hitung nilai akhir (30% * uts + 30% * uas + 40% * tugas)
                        System.out.println("Cari berdasarkan nim");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)){
                            //jika sesuai, Entri nilai.jika tidak, ada pesan " data tidak ditemukan"
                            System.out.println("Entri nilai uts");
                            uts = Integer.parseInt(br.readLine());
                            System.out.println("Entri nilai uas ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.println("Entri nilai tugas");
                            tugas = Integer.parseInt(br.readLine());

                            nilaiAkhir = (uts * 30/100) + (uas * 30/100) + (tugas * 40/100);

                            //cetak nilai akhir
                            System.out.println("nilai akhirn: " + nilaiAkhir) ;

                        }else {
                            System.out.println("Data tidak ditemukan");
                        }

                        break;
                    case  3:
                        System.out.println("=== menu lihat rapor ===");
                        //menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                        System.out.println(nimMhs);
                        System.out.println(namaMhs);
                        System.out.println("nilai akhir mk "+ matakuliah + ":"+ nilaiAkhir);
                        System.out.print("cari bedasarkan nim : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)){
                            if (nilaiAkhir >= 80 && nilaiAkhir <= 100){
                                System.out.println("Nilai huruf : A ");
                            }else if (nilaiAkhir >= 75 && nilaiAkhir <= 79){
                                System.out.println("Nilai huruf : B+ ");
                            }else if (nilaiAkhir >= 65 && nilaiAkhir <= 74 ) {
                                System.out.println("Nilai huruf : B ");
                            } else if (nilaiAkhir >= 60 && nilaiAkhir <= 64 ) {
                                System.out.println("Nilai huruf : C+ ");
                            } else if (nilaiAkhir >= 55 && nilaiAkhir <= 59 ) {
                                System.out.println("Nilai huruf : C+ ");
                            }else {
                                System.out.println("Nilai akhir : E/D ");
                            }
                        /*
                        A = 80 -100
                        B+ = 75 - 79
                        B = 65 - 74
                        C+ = 60 - 64
                        C = 55- 59
                        nilai kurang dari 55 == D/E
                         */


                        }
                        break;
                    default:
                        // jika yang dipilih diluar 1-3, maka keluar dari perulangan
                        System.out.println("Berhasil keluar program");
                        System.exit(0);
                }
            } while (menu < 4);
        } catch (Exception e) {
            System.out.println("Terdapat kesalahan -->" + e.getMessage());
            // kosongkan saja
        }
    }
}

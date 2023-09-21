package daspro_jobsheet4;
import java.util.Scanner;
public class Gaji17 {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);


    int jmlMasuk, JmlTidakMasuk, TotGaji, gaji, potGaji;
    // int gaji=40000, potGaji=25000;

    System.out.println("Masukkan Gaji");
    gaji = input.nextInt();
    System.out.println("Masukkan potGaji");
    potGaji = input.nextInt();
    System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
    jmlMasuk=input.nextInt();
    System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
    JmlTidakMasuk=input.nextInt();

    TotGaji=(jmlMasuk*gaji)-(JmlTidakMasuk*potGaji);
    System.out.println("Gaji yang anda terima adalah "+TotGaji);

    }
}

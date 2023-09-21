package daspro_jobsheet4;

import java.util.Scanner;

public class StudiKasus17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk;
        int harga, jumlah, jmlHal;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan Merk Buku :");
        merk = input.nextLine();
        System.out.println("Masukkan jumlah Halaman Buku :");
        jmlHal = input.nextInt();
        System.out.println("Masukkan Harga Barang Yang Dibeli :");
        harga = input.nextInt();
        System.out.println("Masukkan diskon (satuan persen, ex.10) : ");
        dis = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli :");
        jumlah = input.nextInt();

        total = harga * jumlah;
        jmlDis = total * dis / 100;
        bayar = total - jmlDis;

        System.out.println("Merk Buku " + merk);
        System.out.println("Jumlah Halaman Buku " + jmlHal);
        System.out.println("Jumlah yang anda beli " + jumlah);
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah diskon yang harus dibayar adalah " + bayar);
    }
}


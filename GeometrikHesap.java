/*
 * Ad Soyad: Metehan Salihoglu
 * Ogrenci No: 250542025
 * Görev 1 - Öğrenci Bilgi Sistemi
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        System.out.print("Adinizi girin: ");
        String ad = input.nextLine();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.nextLine();

        System.out.print("Ogrenci numaranizi girin: ");
        int ogrNo = input.nextInt();

        System.out.print("Yasinizi girin: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00 - 4.00 arasi): ");
        double gpa = input.nextDouble();

        System.out.println();
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);

        if (gpa >= 2.5)
            System.out.println("Durum: Basarili Ogrenci");
        else
            System.out.println("Durum: Gelistirilebilir");

        input.close();
    }
}


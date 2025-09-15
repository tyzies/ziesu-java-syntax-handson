package Task4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KONVERTER SATUAN ===");
        System.out.println("1. Meter ke Centimeter");
        System.out.println("2. Celsius ke Fahrenheit");
        System.out.println("3. Rupiah ke Dollar (kurs: 15000)");

        System.out.print("Pilih konversi (1-3): ");
        int pilihan = scanner.nextInt();

        switch(pilihan) {
            case 1:
                System.out.print("Masukkan panjang dalam meter: ");
                double meter = scanner.nextDouble();
                double centimeter = meter * 100;
                System.out.println(meter + " meter = " + centimeter + " cm");
                break;

            case 2:
                System.out.print("Masukkan suhu dalam Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + "°C = " + fahrenheit + " F");
                break;

            case 3:
                System.out.print("Masukkan rupiah: ");
                double rupiah = scanner.nextDouble();
                double dollar = rupiah / 15000;
                System.out.println("Rp" + rupiah + " = $" + dollar);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}


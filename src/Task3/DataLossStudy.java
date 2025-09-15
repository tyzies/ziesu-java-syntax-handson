package Task3;

public class DataLossStudy {
    public static void main(String[] args) {
        System.out.println("=== STUDI KASUS DATA LOSS ===");

        // Kasus 1: Sistem Penilaian
        System.out.println("1. Sistem Penilaian:");
        double nilaiAsli = 87.65;
        int nilaiHuruf = (int) nilaiAsli; // Data loss!

        System.out.println("Nilai asli: " + nilaiAsli);
        System.out.println("Nilai setelah casting ke int: " + nilaiHuruf);
        System.out.println("Data yang hilang: " + (nilaiAsli - nilaiHuruf));

        // Kasus 2: Populasi Negara
        System.out.println("\n2. Data Populasi:");
        long populasiIndonesia = 273_523_615L; // 273 juta+
        int populasiInt = (int) populasiIndonesia; // Overflow!

        System.out.println("Populasi asli (long): " + populasiIndonesia);
        System.out.println("Populasi setelah casting ke int: " + populasiInt);

        // Kasus 3: Konversi mata uang (dollar -> rupiah)
        System.out.println("\n3. Konversi mata uang (dollar -> rupiah)");
        double dollar = 15.99;
        int dollarInt = (int) dollar; // Data loss!
        double rupiahs = dollar * 16000; // No data loss
        int rupiah = (int) dollar * 16000; // Data loss!

        System.out.println("Dollar (double): $" + dollar);
        System.out.println("Dollar setelah casting ke int: $" + dollarInt);
        System.out.println("Data yang hilang: $" + (dollar - dollarInt));
        System.out.println("Konversi dollar ke rupiah: Rp" + rupiah);
        System.out.println("Data yang hilang: Rp" + (rupiahs - rupiah));

        // Kasus 4: Pengukuran jarak GPS (meter -> kilometer)
        System.out.println("\n4. Pengkuruan jarak GPS (meter -> kilometer)");
        double meter = 1950.25;
        int meterInt = (int) meter;
        double kilometers = meter / 1000;
        int kilometer = (int) meter / 1000;

        System.out.println("Meter (double): " + meter + "m");
        System.out.println("Meter setelah casting ke int: " + meterInt + "m");
        System.out.println("Data yang hilang: " + (meter - meterInt) + "m");
        System.out.println("Konversi meter ke kilometer: " + kilometer + "km");
        System.out.println("Data yang hilang: " + (kilometers - kilometer) + "km");

        // Kasus 5: Pengukuran waktu dengan milidetik (milidetik -> detik)
        System.out.println("\n5. Pengukuran waktu dengan milidetik (milidetik -> detik)");
        double milidetik = 1500.75;
        int milidetikInt = (int) milidetik;
        double detiks = milidetik / 1000;
        int detik = (int) milidetik / 1000;

        System.out.println("Milidetik (double): " + milidetik + "ms");
        System.out.println("Milidetik setelah casting ke int: " + milidetikInt + "ms");
        System.out.println("Data yang hilang: " + (milidetik - milidetikInt) + "ms");
        System.out.println("Konversi milidetik ke detik: " + detik + "s");
        System.out.println("Data yang hilang: " + (detiks - detik) + "s");
    }
}


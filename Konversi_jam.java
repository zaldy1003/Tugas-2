import java.util.Scanner;

public class Konversi_jam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pilih1, pilih2;
        double detik;
        double menit;
        double jam;

        System.out.println("Konversi kemana?");
        System.out.println("1. detik");
        System.out.println("2. Menit");
        System.out.println("3. Jam");
        System.out.println("Pilih [1..3]");

        pilih1 = input.nextLine();
        switch (pilih1) {
            case "1":
                System.out.print("Masukkan jumlah detik: ");
                detik = input.nextDouble();
                input.nextLine();

                System.out.println("Konversi Kemana?");
                System.out.println("1. Menit");
                System.out.println("2. Jam");
                System.out.println("Pilih [1..2]");

                pilih2 = input.nextLine();
                switch(pilih2){
                    case "1":
                        System.out.print("Hasil Konversi Waktu detik ke Menit yaitu: " + detik / 60 + " Menit");
                        break;

                    case "2":
                        System.out.print("Hasil Konversi Waktu detik ke Jam yaitu: " + detik / 3600 + " Jam");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid");
                }break;

            case "2":
                System.out.print("Masukkan jumlah Menit: ");
                menit = input.nextDouble();
                input.nextLine();

                System.out.println("Konversi Kemana?");
                System.out.println("1. Detik");
                System.out.println("2. Jam");
                System.out.println("Pilih [1..2]");

                pilih2 = input.nextLine();
                switch(pilih2){
                    case "1":
                        System.out.print("Hasil Konversi Waktu Menit ke Detik yaitu:" + menit * 60 + " Detik");
                        break;

                    case "2":
                        System.out.print("Hasil Konversi Waktu Menit ke Jam yaitu:" + menit / 60 + " Jam");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid");
                }break;

            case "3":
                System.out.print("Masukkan jumlah Jam: ");
                jam = input.nextDouble();
                input.nextLine();

                System.out.println("Konversi Kemana?");
                System.out.println("1. Detik");
                System.out.println("2. Menit");
                System.out.println("Pilih [1..2]");

                pilih2 = input.nextLine();
                switch(pilih2){
                    case "1":
                        System.out.print("Hasil Konversi Waktu Jam ke Detik yaitu:" + jam * 3600 + " Detik");
                        break;

                    case "2":
                        System.out.print("Hasil Konversi Waktu Jam ke Menit yaitu:" + jam * 60 + " Menit");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid");
                }break;

            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}

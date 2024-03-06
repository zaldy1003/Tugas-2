import java.util.Scanner;
public class Konversi_jam_tugas{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan Total Detik: ");
        int Total_detik= input.nextInt();
        int Detik_sekarang=Total_detik%60;

        int Total_menit=Total_detik/60;
        int Menit_sekarang= Total_menit%60;

        int Total_jam= Total_menit/60;
        int Jam_sekarang=Total_jam%24;

        System.out.println("Hasil Konversi: "+ Jam_sekarang+ " Jam :"+Menit_sekarang+" Menit :"+Detik_sekarang+" Detik");
    }
}


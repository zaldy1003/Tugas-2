import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Main {
//    public static void main(String[] args) {
//        input menggunakan class scanner
//        Scanner masukan= new Scanner (System.in);
//        System.out.println("Halo...Siapa Nama anda?");
//        String Nama= masukan.nextLine();
//
//        System.out.println("Berapa NIM anda?");
//        String NIM= masukan.nextLine();
//
//        System.out.println("Dimana fakultas anda?");
//        String fakultas= masukan.nextLine();
//
//        System.out.println("Apa Jurusan anda?");
//        String Jurusan= masukan.nextLine();
//
//        System.out.println("Nama anda: "+Nama);
//        System.out.println("NIM anda: "+NIM);
//        System.out.println("Fakultas anda: "+fakultas);
//        System.out.println("Jurusan anda: "+Jurusan);

//        input menggunakan class BufferReader
//    public static void main(String[] args) throws IOException {
//        InputStreamReader isr= new InputStreamReader(System.in);
//        BufferedReader Masukan= new BufferedReader(isr);
//
//        System.out.println("Halo...Siapa Nama anda?");
//        String Nama= Masukan.readLine();
//
//        System.out.println("Berapa NIM anda?");
//        String NIM= Masukan.readLine();
//
//        System.out.println("Dimana fakultas anda?");
//        String fakultas= Masukan.readLine();
//
//        System.out.println("Apa Jurusan anda?");
//        String Jurusan= Masukan.readLine();
//
//        System.out.println("Nama anda: "+Nama);
//        System.out.println("NIM anda: "+NIM);
//        System.out.println("Fakultas anda: "+fakultas);
//        System.out.println("Jurusan anda: "+Jurusan);

//        input menggunakan JoptionPan
    public static void main(String[] args){
        String Nama= JOptionPane.showInputDialog("Halo...Siapa Nama anda?");
        String NIM= JOptionPane.showInputDialog("Berapa NIM anda?");
        String Fakultas= JOptionPane.showInputDialog("Dimana fakultas anda?");
        String Jurusan= JOptionPane.showInputDialog("Apa Jurusan anda?");

        System.out.println("Nama anda: "+Nama);
        System.out.println("NIM anda: "+NIM);
        System.out.println("Fakultas anda: "+Fakultas);
        System.out.println("Jurusan anda: "+Jurusan);
    }
}

import java.util.Scanner;

public class Ekonomi extends Kerangka {
    //METHOD pesanEkonomi
    public void pesanEkonomi(){
        Scanner input = new Scanner (System.in);

        System.out.println("______________________________________________________________________");
        System.out.println("|                   Menu Pesan Tiket Ekonomi                         |");
        System.out.println("|____________________________________________________________________|");
        System.out.print  ("| Masukkan banyak tiket yang ingin dipesan: ");
        Kerangka.tiketekonomi = input.nextInt();     //menerima input nilai
        Kerangka.banyakTiketEkonomi.push(Kerangka.tiketekonomi);     //menyimpan nilai tiket ke dalam stack banyakTiket
        totalTiket();                //memanggil method totalTiket untuk dijumlahkan
        System.out.println("| Total harga yang harus dibayar adalah: " + getTiket());
        Kerangka.hargaTiketEkonomi.push(getTiket()); //menyimpan nilai yang dihasilkan dari method getTiket ke dalam stack hargaTiket
        totalHarga();               //memanggil method totalHarga untuk dijumlahkan
        System.out.println("|____________________________________________________________________|");
        System.out.println("|                  Terima Kasih Telah Memesan!                       |");
        System.out.println("|                     Selamat Menyaksikan :)                         |");
    }

    //method total tiket
    public void totalTiket(){
        while (!Kerangka.banyakTiketEkonomi.isEmpty()){
            int elemen = Kerangka.banyakTiketEkonomi.pop();
            Kerangka.banyakekonomi += elemen;
        }
    }

    //method total harga yang harus dibayar
    public int getTiket() {
        int harga = 45000;
        return (Kerangka.tiketekonomi * harga);
    }

    //method totalHarga
    public void totalHarga(){
        while(!Kerangka.hargaTiketEkonomi.isEmpty()){
            int elemen = Kerangka.hargaTiketEkonomi.pop();
            Kerangka.hargaekonomi += elemen;
        }
    }
}

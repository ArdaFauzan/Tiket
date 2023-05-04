import java.util.Scanner;

public class VVIP extends Kerangka {
    //METHOD pesanVVIP
    public void pesanVVIP(){
        Scanner input = new Scanner (System.in);

        System.out.println("______________________________________________________________________");
        System.out.println("|                      Menu Pesan Tiket VVIP                         |");
        System.out.println("|____________________________________________________________________|");
        System.out.print  ("| Masukkan banyak tiket yang ingin dipesan: ");
        Kerangka.tiketvvip = input.nextInt();     //menerima input nilai
        Kerangka.banyakTiketVVIP.push(Kerangka.tiketvvip);     //menyimpan nilai tiket ke dalam stack banyakTiket
        totalTiket();                //memanggil method totalTiket untuk dijumlahkan
        System.out.println("| Total harga yang harus dibayar adalah: " + getTiket());
        Kerangka.hargaTiketVVIP.push(getTiket()); //menyimpan nilai yang dihasilkan dari method getTiket ke dalam stack hargaTiket
        totalHarga();               //memanggil method totalHarga untuk dijumlahkan
        System.out.println("|____________________________________________________________________|");
        System.out.println("|                  Terima Kasih Telah Memesan!                       |");
        System.out.println("|                     Selamat Menyaksikan :)                         |");
    }


    public void totalTiket() {
        while (!Kerangka.banyakTiketVVIP.isEmpty()){
            int elemen = Kerangka.banyakTiketVVIP.pop();
            Kerangka.banyakvvip += elemen;
        }
    }

    public int getTiket() {
        int harga = 45000;
        return (Kerangka.tiketvvip * harga);
    }

    //method totalHarga
    public void totalHarga(){
        while(!Kerangka.hargaTiketVVIP.isEmpty()){
            int elemen = Kerangka.hargaTiketVVIP.pop();
            Kerangka.hargavvip += elemen;
        }
    }
}
import java.util.Scanner;

public class VIP extends Kerangka {
    //METHOD pesanVIP
    public void pesanVIP(){
        Scanner input = new Scanner (System.in);

        System.out.println("______________________________________________________________________");
        System.out.println("|                      Menu Pesan Tiket VIP                          |");
        System.out.println("|____________________________________________________________________|");
        System.out.print  ("| Masukkan banyak tiket yang ingin dipesan: ");
        Kerangka.tiketvip = input.nextInt();     //menerima input nilai
        Kerangka.banyakTiketVIP.push(Kerangka.tiketvip);     //menyimpan nilai tiket ke dalam stack banyakTiket
        totalTiket();                //memanggil method totalTiket untuk dijumlahkan
        System.out.println("| Total harga yang harus dibayar adalah: " + getTiket());
        Kerangka.hargaTiketVIP.push(getTiket()); //menyimpan nilai yang dihasilkan dari method getTiket ke dalam stack hargaTiket
        totalHarga();               //memanggil method totalHarga untuk dijumlahkan
        System.out.println("|____________________________________________________________________|");
        System.out.println("|                  Terima Kasih Telah Memesan!                       |");
        System.out.println("|                     Selamat Menyaksikan :)                         |");
    }


    public void totalTiket(){
        while (!Kerangka.banyakTiketVIP.isEmpty()){
            int elemen = Kerangka.banyakTiketVIP.pop();
            Kerangka.banyakvip += elemen;
        }
    }

    public int getTiket() {
        int harga = 45000;
        return (Kerangka.tiketvip * harga);
    }

    //method totalHarga
    public void totalHarga(){
        while(!Kerangka.hargaTiketVIP.isEmpty()){
            int elemen = Kerangka.hargaTiketVIP.pop();
            Kerangka.hargavip += elemen;
        }
    }
}
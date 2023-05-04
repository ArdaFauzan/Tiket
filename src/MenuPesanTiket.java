import java.util.Scanner;

public class MenuPesanTiket {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in); //membuat objek input dari kelas Scanner
        VVIP vvip = new VVIP(); //membuat objek vvip dari kelas VVIP
        VIP vip = new VIP(); //membuat objek vip dari kelas VIP
        Ekonomi eko = new Ekonomi(); //membuat objek eko dari kelas Ekonomi
        ListPenjualanTiket list = new ListPenjualanTiket();

        int pilihan;

        //PERULANGAN DO WHILE
        do {
            System.out.println("______________________________________________________________________");
            System.out.println("|                 Menu Pesan Tiket Bioskop Cinema XII                |");
            System.out.println("|____________________________________________________________________|");
            System.out.println("| 1. Tiket Kelas VVIP      : 45.000.-                                |");
            System.out.println("| 2. Tiket Kelas VIP       : 40.000.-                                |");
            System.out.println("| 3. Tiket Kelas Ekonomi   : 35.000.-                                |");
            System.out.println("| 4. List Penjualan Tiket                                            |");
            System.out.println("| 5. Keluar                                                          |");
            System.out.println("|____________________________________________________________________|");
            System.out.print  ("Masukkan Pilihan: ");
            pilihan = input.nextInt();

            //PENCABANGAN SWITCH
            switch (pilihan) {
                case 1:
                    vvip.pesanVVIP(); //memanggil method vvip
                    break;
                case 2:
                    vip.pesanVIP(); //memanggil method vip
                    break;
                case 3:
                    eko.pesanEkonomi();
                    break;
                case 4:
                    list.listPesanan();
                    break;
                case 5:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    break;
            }

        }while (pilihan != 5);
    }
}
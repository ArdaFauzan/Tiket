//CLASS ListPenjualanTiket
public class ListPenjualanTiket {
    //METHOD listPesanan
    public static void listPesanan (){
        VVIP list = new VVIP();
        VIP list1 = new VIP();
        Ekonomi list2 = new Ekonomi();

        System.out.println("______________________________________________________________________");
        System.out.println("|                    List Total Penjualan Tiket                      |");
        System.out.println("|____________________________________________________________________|");
        System.out.println("| Jenis Tiket | Banyak Tiket Terjual | Total Harga Penjualan         |");
        System.out.println("| VVIP        | "+list.banyakvvip+"                    | "+list.hargavvip+"   ");
        System.out.println("| VIP         | "+list1.banyakvip+"                    | "+list1.hargavip+"   ");
        System.out.println("| Ekonomi     | "+list2.banyakekonomi+"                    | "+list2.hargaekonomi+"   ");
        System.out.println("| Total       | "+(list.banyakvvip+list1.banyakvip+list2.banyakekonomi)+"                    | "+(list.hargavvip+list1.hargavip+list2.hargaekonomi)+"   ");
    }
}
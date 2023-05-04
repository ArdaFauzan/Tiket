import java.util.Stack;

abstract public class Kerangka {
    public static int tiketvvip;
    public static int banyakvvip;
    public static int hargavvip;
    public static int tiketvip;
    public static int banyakvip;
    public static int hargavip;
    public static int tiketekonomi;
    public static int banyakekonomi;
    public static int hargaekonomi;
    public static Stack<Integer> banyakTiketVVIP = new Stack<Integer>();
    public static Stack<Integer> hargaTiketVVIP = new Stack<Integer>();
    public static Stack<Integer> banyakTiketVIP = new Stack<Integer>();
    public static Stack<Integer> hargaTiketVIP = new Stack<Integer>();
    public static Stack<Integer> banyakTiketEkonomi = new Stack<Integer>();
    public static Stack<Integer> hargaTiketEkonomi = new Stack<Integer>();

    //Method
    abstract public void totalTiket();
    abstract public int getTiket();
    abstract public void totalHarga();
}

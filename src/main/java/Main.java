public class Main {
    public static void main(String args[]) {
        BinOps bins = new BinOps();

        System.out.println(bins.mult("1111111111111111", "1001"));
        System.out.println(bins.mult("0000000000000001", "100000100001"));
        System.out.println(bins.sum("1111111111111111", "100000100001"));
        System.out.println(bins.sum("0000000000000000", "100000100001"));
    }
}

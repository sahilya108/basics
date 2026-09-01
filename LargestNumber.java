public class LargestNumber {
    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        ln.largest();
    }

    private void largest() {
        int a=50,b=40,c=55;
        System.out.println(a>b?(a>c?a:c):(b>c?b:c));
    }
}

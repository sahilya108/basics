public class HCFfinder {
    public static void main(String[] args) {
        HCFfinder hf=new HCFfinder();
        hf.hcffinder();
    }

    private void hcffinder() {
        int a = 5;
        int b=7;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
    
}

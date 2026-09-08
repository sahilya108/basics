public class LCMfinder {
    public static void main(String[] args) {
        LCMfinder l=new LCMfinder();
        l.lcmfinder2();
    }

    private void lcmfinder() {
        int l1,n1=l1=12;
        int l2,n2=l2=5;
        int i=2,j=2;
        while(l1!=l2){
            if(l1>l2){
                l2=n2*i;
                i++;
            }
            if(l2>l1){
                l1=n1*j;
                j++;
            }
        }
        System.out.println(l1);
    }

    private void lcmfinder2(){
        int n1=5,n2=7;
        int lcm=(n1>n2)?n1:n2;
        int div=1;
        for(int i=2;i<=lcm/2;i++){
            if(n1%i==0 && n2%i==0){
                div=i;
            }
        }
        lcm=(n1*n2)/div;
        System.out.println("LCM : "+lcm);
    }
}

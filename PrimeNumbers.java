public class PrimeNumbers{
    public static void main(String[] args) {
        PrimeNumbers p=new PrimeNumbers();
        p.primeNumber2();
        
    }

    public void primeNumber(){
        int num=20;
        boolean flag=false;
        for(int i = 2;i<=num/2;i++){
            if(num/i==0){
                System.out.println("Not prime");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Prime");
        }
    }

    public static void primeNumber2(){
        int start=1;
        int end=12;
        if(start==1){
            System.out.println("1 is nither prime or not constant");
            start=2;
        }
        for(int num=start;num<end;num++){
            boolean isprime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    System.out.println(num+" Number is Not prime");
                    isprime=false;
                    break;
                }
            }
            if(isprime==true){
                System.out.println(num+" Number is prime");
            }
        }
    }
}
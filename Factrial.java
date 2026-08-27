

public class Factrial {
    public static void main(String[] args) {
        Factrial f = new Factrial();
        f.factorial();

    }
    
    public void factorial(){
    
        int num = 5;
        int fact=1;
        for(int i =num;i>0;i--){
            fact *= i;
        }
        System.out.println("Factorial : "+fact);
    }
}

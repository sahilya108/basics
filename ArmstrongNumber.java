public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber an = new ArmstrongNumber();
        an.armstrong();
    }

    private void armstrong() {
         int renum,orgnum,num =renum=orgnum=153;
         int po=0;
         while(num>0){
            po++;
            num /= 10;
         }
         int sum=0;
         while(renum>0){
            int digit=renum%10;
            // sum += Math.pow(digit, po);
            int subsum=digit;
            int repo=po;
            while(repo>1){
                subsum *= digit;
                repo--;
               
            }
            sum += subsum;
            
            renum /= 10;
         }
         if(orgnum==sum){
            System.out.println("Armstrong number");
         }
         else{
            System.out.println("Not Armstrong Number");
         }
    }   
}

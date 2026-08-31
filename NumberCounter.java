public class NumberCounter {
    public static void main(String[] args) {
        NumberCounter nc = new NumberCounter();
        nc.countNumbers();
    }

    private void countNumbers(){
        int num=1;
        int counter=0;

        while(num>0){
            counter++;
            num/=10;
        }
        System.out.println("Total Numbers : "+counter);
    }
}

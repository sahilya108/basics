public class SecondHighest {
    public static void main(String[] args) {
        SecondHighest sh = new SecondHighest();
        sh.secondHighest();
        sh.thirdHighest();
    }
        
        private void secondHighest() {
            int arr[]={3,2};
            int first=Integer.MIN_VALUE;
            int second=Integer.MIN_VALUE;
            for(int i =0;i<arr.length;i++){
                if(arr.length<1){
                    return;
                }
                if(first<arr[i]){
                    second=first;
                    first=arr[i];
                }
                else if (second<arr[i] && second!=first) {
                    second=arr[i];
                }
                System.out.println("Find highest Two Elements");
                System.out.println("First : "+first+" & second : "+second);

            }
                
        }
        
        private void thirdHighest() {
        int arr[] ={6,8,15};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr.length<3){
                System.out.println("Array have Less than 3 Elements");
                return ;
            }
            if(first<arr[i]){
                third=second;
                second=first;
                first=arr[i];
            }
            else if (second<arr[i] && arr[i]!=first) {
                
                second=arr[i];
            }
            
        System.out.println("Find highest Two Elements");
        System.out.println("First : "+first+" & second : "+second);
        }
    }
}

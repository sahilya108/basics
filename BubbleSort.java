public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort b=new BubbleSort();
        b.bubbleSort();  
    }
    public void bubbleSort(){
        int arr[]={13,56,7,43,74,5,3,6,67};
        for(int i=0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

    
    
}

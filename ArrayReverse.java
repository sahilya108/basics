public class ArrayReverse{
    public static void main(String[] args) {
        int arr1[]=new int[5];
        int arr2[]={10,20,30,40};
        int end=arr2.length-1;
        int start=0;
        System.out.println("Current Array..!");
        for(int i=0;i<arr2.length;i++){
            System.out.println("element at position "+i+" : "+arr2[i]);
        }

        while(start<end){
            int temp=arr2[start];
            arr2[start]=arr2[end];
            arr2[end]=temp;
            start++;
            end--;
        }

        System.out.println("After reversing Array..!");
        for(int i=0;i<arr2.length;i++){
            System.out.println("element at position "+i+" : "+arr2[i]);
        }
    }
}
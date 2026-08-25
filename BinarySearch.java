public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch b= new BinarySearch();
        int result=b.binarySearch();
        if(result==-1){
            System.out.println("Element Not in Array");
        }
        else{
            System.out.println("Element Found ar position : "+result);
        }
        
    }
    public int binarySearch(){
        int arr[]={2,4,5,6,24,45,67,78};
        int target =2;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(high-low)/2+low;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}

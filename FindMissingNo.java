public class FindMissingNo {
    public static void main(String[] args) {

        FindMissingNo f=new FindMissingNo();
        f.findMissingNo();
        f.findMissingNo2();
        f.findMissingNoByXor();
        
    }
    public void findMissingNo(){
        int arr1[]={1,2,3,5};
        int missingNo=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=missingNo){
                System.out.println("O(n) Methd : "+missingNo);
            }
            missingNo = arr1[i]+1;
        }
    }

    public void findMissingNo2(){
        int arr2[]={1,2,4,5,6};
        int lastDigit =arr2.length;
        int sum = (lastDigit+1)*(lastDigit+2)/2;
        int currentSum=0;
        for(int i=0;i<arr2.length;i++){
            currentSum+=arr2[i];
        }
        int missingNo=sum-currentSum;
        System.out.println("O(n) Method : "+missingNo);
    }

    public void findMissingNoByXor(){
        int arr[]={1,2,3,5};
        int resultXor=0;
        for (int i = 0; i < arr.length; i++) {
            resultXor=resultXor^arr[i];
        }
        for(int i=1;i<=arr.length+1;i++){
            resultXor=resultXor^i;
        }
        System.out.println(resultXor);
    }    
}

class reverseArray{
    public static void main(String[] args){
        int arr[] = {5,7,9,1,3};
        int n = arr.length;
        reverse(arr,0,n-1,n);
    }

    static void reverse(int[] arr, int start,int end,int n){
        if(start >= end){
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,start+1,end-1,n);
    }
}
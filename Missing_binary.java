class Missing_binary{
    static int binaryMissing(int[] arr){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==mid)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }

    public static void main(String[] args){
        int[] arr={0,1,2,6,9,11,19};
        System.out.println(binaryMissing(arr));
    }
}
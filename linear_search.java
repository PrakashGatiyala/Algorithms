class Main{
    public static int linear_search(int[] arr, int ele){
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==ele) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        int ele = 7;
        int idx = linear_search(arr, ele);
        if(idx !=-1) System.out.println("Element exists");
        else System.out.println("Element doesn't exists");        
        
    }
}
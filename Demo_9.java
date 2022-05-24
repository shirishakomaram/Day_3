package demo;

public class Demo_9 {
	static int smallestArray(int[] arr){
        int minValu=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minValu)
                minValu=arr[i];
        }
        return minValu;
    }
    public static void main(String[] args){
        int[] arr={5,1,2,7,4,8};
        int minValu=smallestArray(arr);
        System.out.println(minValu);
    }
}



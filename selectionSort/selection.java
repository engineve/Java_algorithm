public class selection {

    public static void main(String[] arg){
        int[] arr={1,20,3,55,5};

        for(int i=0 ; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0 ; i<arr.length; i++)
            System.out.print("\t"+arr[i]); // 1	3	5	20	55
    }
}

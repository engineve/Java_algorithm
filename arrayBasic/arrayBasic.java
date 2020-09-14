import java.util.Scanner;

public class arrayBasic {
    static int[] arr=new int[] {1,2,3,4,5};
    static int[] arr1={6,7,8,9,10};

    public static void main(String[] args){
        for(int i=0 ; i<arr.length; i++)
        System.out.println(arr[i]); // 1 2 3 4 5

        int[] data=new int[3];
        Scanner s=new Scanner(System.in);
        String item;
        for(int j=0 ; j<data.length ; j++){
            item=s.next();
            data[j]=Integer.parseInt(item);
        }
        System.out.printf(data[0]+" "+data[1]+" "+data[2]);
       
    }
    
}

public class dowhile{

    public static void main(String[] args){
        int sum=0;
        int i=0;

        do{
            i++;
            sum+=i; 
        }while(i<10);
        System.out.print(sum); // 55
    }
}
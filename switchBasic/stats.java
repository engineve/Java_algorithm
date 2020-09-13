import java.util.Scanner;

public class stats {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str;
        str=scan.next();
        
        switch(str){
            case "chicken":
                System.out.println("Fried Chicken");
                break;

            case "pizza":
                System.out.println("Pizza Hut");
                break;

            default:
                System.out.println("Noodle at home");
        }
    }
}

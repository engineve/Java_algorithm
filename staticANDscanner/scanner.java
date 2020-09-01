import java.util.Scanner;

public class scanner {
    
    static int num=15;

    public static void display(){
        System.out.println(num);
    }

    public static void main(String[] args) {   
        scanner.display(); // 15
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int converted=Integer.parseInt(str);
        System.out.printf("Input is %d %n", converted); // Input is 
    }

}

// System.in.read(byte[])

// BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
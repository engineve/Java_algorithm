public class assignA {
    public static int a;

    public static void display(int x){
        System.out.println(x);
    }

    public static void main(String[] args){
        assignA a1=new assignA();
        assignA a2=new assignA();

        a1.a=10;
        a2.a=20;

        System.out.println(a); //20

        assignA.display(1000); // 1000
        assignA A=new assignA(); 
        A.display(5000); // 5000
    }
}
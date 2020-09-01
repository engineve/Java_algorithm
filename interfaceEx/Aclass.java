interface ex1 {
    void count(int x);
}

interface ex2 {
    void get(String x);
}

interface ex extends ex1,ex2 {
    
}

class data{
    static String item;
    static int num=0;
}

public class Aclass extends data implements ex{


    public void count(int x){
        num=num+x;
    }

    public void get(String x){
        item=x;
    }
    public static void main(String[] args){
        Aclass check=new Aclass();
        check.count(5);
        check.get("Iphone");
        System.out.println("There are "+num+" "+item+"s"); // There are 5 Iphones
    }
}
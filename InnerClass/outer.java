public class outer {
    public outer(){
        System.out.println("outer.java");
    }
    static class inner{
       private int a=30;
       public void display(){
           System.out.println(a);
       }
    }
    public static void main(String[] args){
       
    }
}



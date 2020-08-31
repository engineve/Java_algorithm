public class test {
    public test(){
        super();
    }
    public static void main(String[] args){
        outer.inner check=new outer.inner(); // check can access inner members only
        check.display(); // 30
    }
}
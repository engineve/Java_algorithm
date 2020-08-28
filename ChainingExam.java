public class ChainingExam{
    public int a;
    public int b;
    public int c;
    
    public ChainingExam(int var){
        this(var, 1);
    }
    public ChainingExam(int var1, int var2){
        this(var1,var2, 2);
    }
    public ChainingExam(int var1, int var2, int var3){
        this.a=var1;
        this.b=var2;
        this.c=var3;
    }


  public static void main(String[] args) {   
    ChainingExam example=new ChainingExam(5);
    System.out.print(example.a+", "+example.b+", "+example.c); // 5, 1, 2
  }

}

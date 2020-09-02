public class ATM {
    public String bank;
    private static double money; // use set_money method to change this data
    
    public void set_bank(String name){
        bank=name;
    }
    public void set_money(double amount){
        money=amount;
    }
    public void display(){
        System.out.printf("Money deposit in %s : %.1f",bank, money); 
    }
    public static void main(String[] args){
    
    }
}
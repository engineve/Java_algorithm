public class ATM {
    public String bank;
    private static double money; // if other class can't access so use set_money method to change this data

    public void set_money(double amount){
        money=amount;
        
    }
    public static void main(String[] args){
        ATM user=new ATM();
        user.set_money(5000);
        System.out.println("Money deposit : "+money); // Money deposit : 5000.0
    }
}
public class user {

    public static void main(String[] args){
        ATM user1=new ATM();
        user1.set_bank("ABC");
        user1.set_money(5000);
        user1.display(); // Money deposit in ABC : 5000.0
    }
    
}
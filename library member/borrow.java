import java.util.*;

public class borrow extends member {

    public borrow(String d1, String d2,Date d3){
        super(d1,d2,d3);
    }
    public static void main(String[] args){
        borrow user1=new borrow("John","01012345678",new Date()); // on Tue Sep 01 16:31:15 KST 2020, John visited here
        user1.set_book("Happiness"); // borrowed Happiness     
    }
    
}
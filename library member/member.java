import java.util.*;

public class member {
    protected String name;
    protected String phone;
    protected Date date;
    protected String book;

    public member(String n, String p, Date d){
        name=n;
        phone=p;
        date=d;
        System.out.printf("on %s, %s visited here ", date, name);
    }
    public void set_book(String b){
        book=b;
        System.out.printf("borrowed %s",book);
    }
    public static void main(String[] args){

    }
}
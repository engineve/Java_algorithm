import java.util.*;

public class day {
    public Date info;

    public day(){
        info=new Date();
        System.out.println("What day is it today? : "+info);
    }

    public static void main(String[] args){
        day d=new day();   // What day is it today? : Sun Aug 30 22:59:00 KST 2020
    }
}
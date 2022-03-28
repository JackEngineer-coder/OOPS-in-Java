import java.util.*;
interface Teacher{
  public abstract void subject();
}
public class Subject_Name implements Teacher{
  public void subject (){
    System.out.println("Math");
  }
  public static void main(String[] args){
    Subject_Name s1  =new Subject_Name();
    s1.subject();
  }
}

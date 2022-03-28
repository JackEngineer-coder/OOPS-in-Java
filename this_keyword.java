import java.util.*;
class ThisKeyword{
  int i;
  public void setvalue(int i){
    this.i = i; // this is referece variable of the class's variable.
  }
  public void display()
  {
    System.out.println(i);
  }
}
public class Test{
  public static void main(String[] args)
  {
    ThisKeyword keyword = new ThisKeyword();
    keyword.setvalue(100);
    keyword.display();
  }
}

import java.util.*;
class Employee{
  private int emp_id;
  public void Set_emp_id(int empid)
  {
    emp_id = empid;
  }
  public int get_emp_id()
  {
    return emp_id;
  }
  
}
public class company{
  public static void main(String[] args){
    Employee e1 = new Employee();
    e1.Set_emp_id(100);
    System.out.println(e1.get_emp_id());
  }
  
}

import java.util.*;
public class Employee{
  String name;
  int id;
  public Employee(String name, int id){
    this.name = name;
    this.id = id;
    
  }
  public static void main(String[] args)
  {
    Employee e1 = new Employee("Jitender Chauhan" , 12345);
    Employee e2 = new Employee("Puneet Sharma" , 123456);
    
    System.out.println(e1.name + " " + e1.id);
    System.out.println(e2.name + " " + e2.id);
  }
}

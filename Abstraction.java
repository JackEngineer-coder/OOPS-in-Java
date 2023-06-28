import java.util.*;
abstract class vehicle{
  abstract void start();
  
}
class car extends vehicle{
  void start(){
    System.out.println("Starts by Key");
  }
}
public class scooter extends vehicle{
  void start(){
    System.out.println("Starts by kick");
  }
  public static void main(String[] args)
  {
    car alto = new car();
    alto.start();

    scooter bajaj = new scooter();// bajaj is a scooter
    bajaj.start();
  }
}

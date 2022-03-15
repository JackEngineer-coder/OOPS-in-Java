
class Animal{
  public static void main(String[] args)
  {
    Animal buzo = new Animal();
    buzo.Run();
    buzo.Eat();
    Birds sparrow = new Birds();
    sparrow.fly();
    
  }
    public void Run(){
      System.out.println("I am Running");
    }

    public void Eat(){
      System.out.println("I am Eating");
    }
}
class Birds{
  public void fly(){
    System.out.println("I am flying");
  }
}

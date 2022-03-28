import java.util.*;
interface Teacher{
  public abstract void name();
  
}
interface Subject{
  public abstract void subject_name();
}
public class Details implements Teacher, Subject{
  public void subject_name()
  {
    System.out.println("Math");
  }
  public void name()
  {
    System.out.println("P.K. Anand");
  }
  public static void main(String[] args)
  {
    Details teacher_name = new Details();
    teacher_name.name();
    Details teacher_subject = new Details();
    teacher_subject.subject_name();
  }
}

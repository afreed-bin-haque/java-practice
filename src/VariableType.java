import java.util.Scanner;
public class VariableType {
  /** Lcoal Variable: 
  * Local Variable is declared in method staticly and is not accessable extaranaly
  * It can be construct in construction or inside the body of a method 
   */
  Scanner visitorInput = new Scanner(System.in);
   public void localVariable() {
    String Name = "Afreed Bin Haque";
    int age = 26;
    String spouse = "Afsana Akter Nipu";
    System.out.println(Name+" is "+age+" years old");
    System.out.println("He is married to " + spouse);
  }

  /**
   * Normal method:
   * Will also run along with local variable function
   * Here is a Scannar demo in NormalMethod() for taking values from user
   */
  
  public void NormalMethod() {
    
    System.out.println("Please write your name who is visiting for those info");
    String visitorName = visitorInput.nextLine();
    System.out.println("Why are you searching for those info? "+visitorName);
  }

 

  /** Static variable: 
   * Static variable declared inside the class but outside of method or constructor
   * If it is not declared statically will return an error exception 
  */
  public int accpetableage = 18;
  public static boolean status;
  public boolean compareAge(int visitorAge){
    if (accpetableage <= visitorAge) {
      return true;
    } else {
      return false;
    }
  }  
   
  /**
   * Instance Variable & Static variable:
   * Instance Variable:
   * Instance variable is same as like like Local Variable but declared out of
   * method or class
   * for integet Scannar calls nextInt and for string Scannar calls nextLine.
   * Static variable 
   */

  public static String url;
  public static String child_url;

  public void instanceVariable() {
    url = "https://www.youtube.com/@afreedbinhaque8889";
    child_url = "https://www.youtubekids.com/";
    int visitorAge = visitorInput.nextInt();
    boolean verifyAge = compareAge(visitorAge);
    if (accpetableage <= visitorAge) {
      System.out.println("Ok you are varified to visit those infos");
      if(verifyAge == true){
        System.out.println(url);
      }else{
        System.out.println(child_url);
      }
    } else {
      System.out.println("Stop !! you can not visit those infos");
      if (verifyAge == true) {
        System.out.println(url);
      } else {
        System.out.println(child_url);
      }
    }
  }

  public static void main(String[] args) throws Exception{ 
    VariableType vartype = new VariableType();
    vartype.localVariable();
    vartype.NormalMethod();
    System.out.println("Enter your age in number value");
    vartype.instanceVariable();
  }
  
}

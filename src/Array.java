import java.util.Scanner;

public class Array {

  String[] name = { "Newton", "Pinjira", "Afreed","Nipu", "Rafeed" };
  int nameLength = name.length-1;
  Scanner takeInput = new Scanner(System.in);
  public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
  public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

  public void DemoArray(){
    for(int i=0;i< name.length;i++){
      System.out.println(name[i]);
    } 
  }

  public void TakeLength(){
    System.out.println("Type your desire index. Total array index lenght is " + nameLength);
    int index = takeInput.nextInt();
    System.out.println("You have selected member :"+name[index]);
  }

  public void MakeArray(){ 
    int number; 
    int[] array;
    System.out.print("Enter length of your array: ");
    int lenght = takeInput.nextInt();
    array = new int[lenght];
    System.out.print("Enter the number of elements you want to store: ");
    number = takeInput.nextInt(); 
    if(number <= array.length){
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < number; i++) {

        array[i] = takeInput.nextInt();
      }
      System.out.println(ANSI_GREEN_BACKGROUND+"Array elements are: ");

      for (int i = 0; i < number; i++) {
        System.out.println(array[i]);
      }
    }else{
      System.out.println(ANSI_RED_BACKGROUND+"Warning your stored number is bigger then array length");
    } 
  }
  
  /**Runner */
  public static void main(String[]arg) throws Exception{
    Array arr = new Array();
    arr.DemoArray(); 
    arr.TakeLength();
    arr.MakeArray();
  }
}

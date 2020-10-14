/**
 *
 * @author 
 */
public class Main {


  public static boolean isNiven(int number){
  //variables here
  int last;
  int storage = 1;
  //so i can use the original number later
  int numberTwo = number;
  boolean check;
  //modulus number by 10 and adds the remainder to the storage variable then divides the number by 10
    while(number > 10){
      last = number % 10;
      storage = storage + last;
      number = number / 10;
      }
    //checks if the original number divided by the final value of storage is equal to 0, if so its a niven number so its true if not, its false
    if(numberTwo % storage == 0){
      check = true;
    } else {
      check = false;
    }
    //return
    return check;
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //calls method
    boolean endNum = isNiven(18);
    System.out.println(endNum);
  }
}

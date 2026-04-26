import java.util.Scanner;
public class Atm_Interface{
public static void main(String args[]){
  System.out.println("Welcome to the ATM Interface");
  System.out.println("1.Check Balance");
  System.out.println("2.Deposit Money");
  System.out.println("3.Withdraw Money");
  System.out.println("4.Exit");
  Scanner s=new Scanner(System.in);
  double balance=0.0;
  double depositAmount,withdrawAmount;
  while(true){
    System.out.println("Choose an option (1-4): ");
    int choice=s.nextInt();
    switch(choice){
      case 1:
        System.out.println("Your current balance is: "+balance);
        break;
      case 2:
        System.out.println("Enter deposit amount: ");
        depositAmount=s.nextDouble();
        balance+=depositAmount;
        System.out.println("Deposit successful.New balance is: "+balance);
        break;
      case 3:
        System.out.println("Enter withdrawal amount: ");
        withdrawAmount=s.nextDouble();
        if(withdrawAmount>balance){
          System.out.println("Insufficient funds.");
        }else{
          balance -= withdrawAmount;
          System.out.println("Withdrawal successful.New balance is: "+balance);
        }
        break;
      case 4:
        System.out.println("Thank you for using the ATM. Goodbye!");
        s.close();
        return;
      default:
        System.out.println("Invalid option. Please try again.");
    }
  }
}

import java.util.*;
public class CodeAlphatask2 {
    public   void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME");
        System.out.println("Enter id");
        int id=sc.nextInt();
        System.out.println("Enter name");
        String name=sc.next();
        BankAccount User=new BankAccount(name,id);

}
class BankAccount{
    Scanner sc=new Scanner(System.in);
    int AvBalance=0;
    int choice=1;
    BankAccount(String name,int id){
        while(choice!=0){
        System.out.println("Menu");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter your choice\n " +
                "1-Check Balance \n 2-Money deposit\n 3-Money Withdraw\n 4-Exit");
        int ch=sc.nextInt();
        switch (ch){
            case 1: System.out.println(AvBalance);
                     break;
            case 2: System.out.println("Enter Amount");
                int Amount=sc.nextInt();
                Deposit(Amount);
                break;
            case 3:System.out.println("Enter Amount");
                int Amount1=sc.nextInt();
                Withdraw(Amount1);
                break;
            case 4: choice=0;
            System.out.println("Hope you like our service!\n Have a good day");
             break;
            default:System.out.println("INVALID CHOICE");
        }}

    }
    void Withdraw(int Amount){
        if( AvBalance<Amount){
            System.out.println("No sufficient  balance");
        }
        else{
            AvBalance=AvBalance-Amount;
            System.out.println("Amount Withdrawal");

        }
    }
    void Deposit(int Amount){
        AvBalance=AvBalance+Amount;
        System.out.println("Amount deposited");
    }

}}

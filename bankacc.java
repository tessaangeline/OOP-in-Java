import java.util.Scanner;
class Acc{
    int accno;
    String name;
    double balance;

    Acc(int a, String n, double b){
        accno=a;
        name=n;
        balance=b;
    }
    Acc(int an, String na){
        accno=an;
        name=na;
    }

    void deposit(double amnt){
        balance=balance+amnt;
    }
    void withdraw(double amnt){
        balance=balance-amnt;
    }
    double checkbalance(){
        System.out.println("Current balance is: "+balance);
        return balance;
    }
    void display(){
        System.out.println("Account Holder Details: \n"+"Acc number: "+ accno+ "\nHolder'name: "+ name + ("\nBalance: ")+ balance);
    }
}
public class bankacc{
    public static void main(String args[]){
        Acc a=new Acc(01,"anu",1000.0);
        Acc b=new Acc(02,"mariam");
        Scanner s=new Scanner(System.in);

        a.display();
        System.out.println("Enter the acc number: ");
        b.accno=s.nextInt();
        System.out.println("Enter the name of the holder: ");
        b.name=s.nextLine();
        b.name=s.nextLine();

        int op=0;
        double amount=0;
        System.out.println("Menu \n1.Deposit \n2.Withraw \n3.View Balance \n4.Display account details \n5.Exit");
        do{
        System.out.println("Enter the option");
        op=s.nextInt();
        switch(op){
            case 1: System.out.println("Enter the amount to deposit: ");
                    amount=s.nextDouble();
                    b.deposit(amount);
                    break;
            case 2: System.out.println("Enter the amount to be withrawn: ");
                    amount=s.nextDouble();
                    if(amount > b.balance){
                        System.out.println("No suffient balance!");
                        break;
                    }
                    else{
                        b.withdraw(amount);                    
                    }
                    break;
            case 3:b.checkbalance();
                    break;
            case 4:b.display();
                    break;
            case 5:System.out.println("Exiting...");
                    break;
            default:System.out.println("Invalid choice");
        }
    }while(op!=5);
    }
}

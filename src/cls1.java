import java.util.Scanner;
public class cls1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        BankAcc bc=new BankAcc("Dhivya",10000,101);
        boolean check=true;
        int ch=0;
        while(check) {
            System.out.println("WELCOME\n1.Deposit\n2.Withdrawl\n3.Check Balance\nEnter Your Option (1/2/3): ");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double am = scan.nextDouble();
                    System.out.println("Amount deposited Successfully: " + bc.deposit(am));
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double am1 = scan.nextDouble();
                    System.out.println(bc.withdraw(am1));
                    break;
                case 3:
                    bc.Balance();
                    break;
                default:
                    System.out.println("Enter Correct  Option!!!");

            }
            System.out.println(" if to Stop the program,Enter 1 ! ");
            int c=scan.nextInt();
            if(c==1){
                check=false;
            }

        }
    }
}
class BankAcc{
    String owner;
    double balance;
    int id;
        public BankAcc(){
                this.owner=null;
                this.balance=0.00;

        }
        public BankAcc(String owner,double balance,int id){
            this.owner=owner;
            this.balance=balance;
            this.id=id;
        }
        public double deposit(double amount){
                    balance=balance+amount;
                    return balance;
        }
        public double withdraw(double amount){
                if(balance>=amount){
                    balance= balance-amount;
                    return balance;
                }

                System.out.println("Insufficient Balance");
                return balance;
        }
        public void Balance(){
            System.out.println("Your Balance is : "+balance);

        }
}

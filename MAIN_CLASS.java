package ATM_interface;
import java.util.*;

public class MAIN_CLASS {
    public static void main(String []args)
    {
        int atmNumber=12345;
        int atmPin=123;
        int choice;
        AtmOperationInterface inter=new AtmOperationInterface();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter ATM Number :==>>");
        int atmnumber=in.nextInt();
        System.out.println("Enter the ATM pinnumber :==>>");
        int atmpin=in.nextInt();
        if((atmNumber==atmnumber)&&(atmPin==atmpin)) {
            System.out.println("********** Welcome To ATM Machine ************");
            do{
            System.out.println("Sucessfully log In ==>>>\n GO Ahead ==>>");
            System.out.println(" 1.Check Account balance\n 2.Deposite amount\n 3.withdraw the amount\n 4.View ministatment\n 5.Quit");
            choice = in.nextInt();

                switch (choice) {
                    case 1:
                        inter.viewBalance();
                        break;
                    case 2:
                        System.out.println("Enter the Amount Balance to deposite ");
                        double amount = in.nextInt();
                        inter.depositeAmount(amount);
                        break;
                    case 3:
                        System.out.println("Enter the withdraw amount");
                        int remov_amt = in.nextInt();
                        inter.withdrawAmount(remov_amt);
                        break;
                    case 4:
                        inter.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("You can remove ATM card \n Thank you for visiting!");
                        System.exit(0);
                        break;
                }
            }while(choice!=6);
        }
        else {
            System.out.println("Please Check again Atmnuber and Confirm pin");
            System.exit(0);
        }


    }
}

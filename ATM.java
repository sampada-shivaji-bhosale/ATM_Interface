package ATM_interface;
public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public ATM(){
        balance=0;
        depositAmount=0;
        withdrawAmount=0;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double bal){
        balance=bal;
    }

}

package ATM_interface;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationInterface {
    private double total;
    Map<Double,String>minisate=new HashMap<>();
    ATM obj=new ATM();
    public void viewBalance(){
        System.out.println("The available balance is :"+obj.getBalance());

    }
    public void withdrawAmount(double withdraw){
        System.out.println(withdraw+"Collect the cash");
        total=obj.getBalance();
        if(total>withdraw) {
            minisate.put(withdraw,"amount withdraw");
            total = total - withdraw;
            obj.setBalance(total);
            System.out.println("Current Balance :"+total);
        }
        else{
            System.out.println("Insufficient balance ");
        }

    }
    public void depositeAmount(double deposite){
        minisate.put(deposite,"amount deposite");
        total=obj.getBalance();
        total=total+deposite;
        obj.setBalance(total);
        System.out.println("Amount deposited sucessfully");
        System.out.println("Current Balance :"+total);


    }
    public void viewMiniStatement(){
        for(Map.Entry<Double,String>m:minisate.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Current balance:"+obj.getBalance());


    }
}

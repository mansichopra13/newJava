package oops;

//hiding the internal state of an object and only allowing access to it through public methods (getters and setters).

//Feature	Benefit
// Data Hiding	Keeps internal data safe from misuse
// Validation	Prevents invalid data being set
// Maintenance	Easier to manage and modify code
// Reusability	Logic is reusable via public methods

public class encap {
    //ex-1
    // private String name;

    // public String getName(){
    //     return name;
    // }
    // public void setName(String newName){
    //     this.name=newName;
    // }

    //ex-2
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
        }
        else{
            System.out.println("invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds or invalid amount .");
        }
    }

    public static void main(String [] args){
        encap account = new encap();
        account.deposit(5000);
        account.withdraw(1000);
        System.out.println("current balance :"+account.getBalance());
    }

}

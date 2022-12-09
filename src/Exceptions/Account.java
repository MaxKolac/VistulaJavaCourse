package Exceptions;

public class Account {
    String owner;
    int balance;
    int accountNumber;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(String owner, int balance, int accountNumber){
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void transferMoneyTo(Account recipient, int amount){
        try{
            if (this.balance < amount) throw new NotEnoughMoneyException();
            this.balance -= amount;
            recipient.balance += amount;
            System.out.println("Succesfully transfered " + amount + " from your balance to account number " + recipient.accountNumber );
        }
        catch (NotEnoughMoneyException exception){
            System.out.println("You do not have enough funds on your balance to make this transaction.");
        }
        catch (Exception exception){
            System.out.println("Unknown exception");
            exception.printStackTrace();
            System.out.println(exception);
        }
        finally{
            System.out.println("Current balance for " + this.owner + " (" + this.accountNumber + ") is: " + this.balance);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}

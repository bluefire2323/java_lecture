package test_20211107;

public class Account {
    private String owner;
    private long balance;

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public Account(){

    }
    public Account(String owner){
        this.owner = owner;
    }
    public Account(long balance){
        this.balance = balance;
    }
    public Account(String owner, long balance){
        this.owner = owner;
        this.balance = balance;
    }
}

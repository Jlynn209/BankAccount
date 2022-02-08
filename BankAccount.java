public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static int bankTotalAmount;

    public BankAccount(){
        setNumberOfAccounts();
    }

    public double depositMoney(String account, double amount){
        if (account.equals("checking")){
            setCheckingBalance(amount);
            setBankTotalAmount(amount);
            System.out.printf("Total amount in the bank account is now $%.2f amount \n", this.checkingBalance);
        }
        else if (account.equals("savings")){
            setSavingsBalance(amount);
            setBankTotalAmount(amount);
            System.out.printf("Total amount in the bank account is now $%.2f amount \n", this.savingsBalance);
        }else{
            System.out.println("Please type what account you want to deposit in next time.");
        }
        return amount;
    }

    public void withDrawMoney(String account, double amount){
        if (hasFunds(account, amount)){
            if (account.equals("checking")){
                setCheckingBalance(-amount);
                setBankTotalAmount(-amount);
            }
            else if (account.equals("savings")){
                setCheckingBalance(-amount);
                setBankTotalAmount(-amount);
            }
        }else{
            System.out.println("Insufficient Funds");
        }
    }

    public Boolean hasFunds(String account, double amount){
        boolean hasFunds = true;
        if (account.equals("checking")){
            if (amount > getCheckingBalance()){
                hasFunds = false;
            }
        }
        else if (account.equals("savings")){
            if (amount > getSavingsBalance()){
                hasFunds = false;
            }
        }else{
            System.out.println("Please type what account you want to deposit in next time.");
        }
        return hasFunds;
    }


    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    private void setCheckingBalance(double amount){
        this.checkingBalance += amount;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    private void setSavingsBalance(double amount){
        this.savingsBalance += amount;
    }

    public static double getBankTotalAmount(){
        return bankTotalAmount;
    }

    private static void setBankTotalAmount(double amount){
        bankTotalAmount += amount;
    }   


    public static int getNumberOfAccounts(){
        return numberOfAccounts;
    }

    private static void setNumberOfAccounts(){
        numberOfAccounts++;
    }
    

}
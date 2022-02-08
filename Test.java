public class Test {
    public static void main(String[] args){
        BankAccount jeremy = new BankAccount();
        BankAccount andy = new BankAccount();

        jeremy.depositMoney("checking", 25.00);
        jeremy.depositMoney("checking", 50.00);
        jeremy.withDrawMoney("checking", 10.00);
        System.out.println(BankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getBankTotalAmount());
    }
}

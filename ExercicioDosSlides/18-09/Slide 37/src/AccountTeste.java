public class AccountTeste {
    public static void main(String[] args) {
    // create two Account objects
        Account account1 = new Account("Jane Green",200.00);
        Account account2 = new Account("John Blue",300.00);

    // display initial value of name for each Account
        System.out.printf("account1 name and saldo is: %s%n$%.2f%n", account1.getName(), account1.getSaldo());
        System.out.printf("account2 name and saldo is: %s%n$%.2f%n", account2.getName(), account2.getSaldo());
    }
}

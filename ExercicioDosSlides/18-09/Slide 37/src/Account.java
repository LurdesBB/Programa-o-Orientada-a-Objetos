public class Account {
    private String name;
    private Double saldo;

    public Account(String name, double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}

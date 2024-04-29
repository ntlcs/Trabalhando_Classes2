public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public String titular;


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void exibirDadosConta() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Titular: " + titular);
    }
}

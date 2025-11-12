package Banco;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: o valor do depósito deve ser positivo.");
        }
    }

    public void depositar(int valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: o valor do depósito deve ser positivo.");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do saque deve ser positivo.");
            return false;
        }

        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Erro: saldo insuficiente para saque de R$ " + valor);
            return false;
        }
    }
}

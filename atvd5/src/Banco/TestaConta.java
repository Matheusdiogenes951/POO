package Banco;

public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        // ❌ Tentativa de acessar diretamente o saldo (gera erro de compilação)
        // conta.saldo = 1000; // ERRO: saldo tem acesso privado

        // ✅ Depósito com double
        conta.depositar(150.75);

        // ✅ Depósito com int (sobrecarga)
        conta.depositar(50);

        // ✅ Consulta de saldo via getter
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        // ✅ Saque bem-sucedido
        conta.sacar(100);

        // ❌ Tentativa de saque maior que o saldo
        conta.sacar(5000);

        // ✅ Mostrando o saldo final
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}

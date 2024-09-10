public class Main {
    public static void main(String[] args) {
        Cliente Joao = new Cliente("João");
        Cliente Maria = new Cliente("Maria");

        Conta cc = new ContaCorrente(Joao);
        Conta cp = new ContaPoupanca(Maria);

        cc.depositar(1000.0);
        cp.depositar(500.0);

        cc.sacar(100.0);
        cp.sacar(50.0);

        cc.transferir(200.0, cp);

        cc.extrato();
        cp.extrato();
    }
}
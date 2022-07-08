package BancoDigital;

public class CriarConta {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente 1");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cliente 2");

        Conta cc1 = new ContaCorrente(cliente1);
        cc1.depositar(7000);

        Conta cp1 = new ContaPoupanca(cliente1);
        cc1.transferir(4000, cp1);

        Conta cp2 = new ContaPoupanca(cliente2);
        cc1.transferir(200, cp2);

        cc1.imprimirExtrato();
        System.out.println("\n");
        cp1.imprimirExtrato();
        System.out.println("\n");
        cp2.imprimirExtrato();
        System.out.println("\n");
    }
}

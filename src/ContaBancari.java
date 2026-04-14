public class ContaBancari {

    static class ContaBancaria {
        private double saldo;

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void depositar(double valor) {
            setSaldo(getSaldo() + valor);
        }

        public void sacar(double valor) {
            System.out.println("Saldo atual: R$ " + getSaldo());
            System.out.println("Valor do saque: R$ " + valor);

            if (valor <= getSaldo()) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saldo final: R$ " + getSaldo());
            } else {
                System.out.println("Saldo insuficiente.");
                System.out.println("Saldo final: R$ " + getSaldo());
            }
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setSaldo(1000);

        conta.sacar(300);
        conta.sacar(800);
    }
}
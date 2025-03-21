package Ejercicio4;

public class Principal {
    public static void main(String[] args) {
        Conta contaOrigen = new Conta("Ana", "ES123456", 0.5, 1000);
        Conta contaDestino = new Conta("Pedro", "ES654321", 0.3, 500);

        contaOrigen.transferencia(contaDestino, 200);
        System.out.println("Saldo orixe: " + contaOrigen.getSaldo());
        System.out.println("Saldo destino: " + contaDestino.getSaldo());
    }
}

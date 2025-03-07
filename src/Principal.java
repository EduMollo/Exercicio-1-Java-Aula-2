public class Principal {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Digite a quantia (múltiplo de 10): ");
        int quantia = scanner.nextInt();
        int notas50 = quantia / 50;
        quantia %= 50;
        int notas20 = quantia / 20;
        quantia %= 20;
        int notas10 = quantia / 10;
        quantia %= 10;
        int resto = quantia;
        System.out.println("Cédulas de 50: " + notas50);
        System.out.println("Cédulas de 20: " + notas20);
        System.out.println("Cédulas de 10: " + notas10);
        if (resto != 0) {
            System.out.println("Restante: " + resto);
        }
    }
}

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[5];
        double soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = input.nextDouble();
            soma += numeros[i];
        }
        
        double media = soma / numeros.length;
        System.out.println("A média dos números é: " + media);
    }
}

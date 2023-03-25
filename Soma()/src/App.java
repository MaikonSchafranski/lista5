public class App {
    
    public static int soma(int... numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int resultado1 = soma(1, 2, 3);
        int resultado2 = soma(4, 5, 6, 7, 8);
        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);
    }
}
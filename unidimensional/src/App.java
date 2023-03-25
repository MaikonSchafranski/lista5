public class App {
    public static void main(String[] args) throws Exception {
        //primeira forma
        double[] numeros = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0 };

        //segunda forma
        double[] numeros2 = new double[12];
        numeros[0] = 1.0;
        numeros[1] = 2.0;
        numeros[2] = 3.0;
        numeros[3] = 4.0;
        numeros[4] = 5.0;
        numeros[5] = 6.0;
        numeros[6] = 7.0;
        numeros[7] = 8.0;
        numeros[8] = 9.0;
        numeros[9] = 10.0;
        numeros[10] = 11.0;
        numeros[11] = 12.0;

        System.out.println("primeira forma de vetor: " + numeros);
        System.out.println("segunda forma de vetor: "+ numeros2);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {10, 2, 9, 3, 8, 4, 7, 5, 6, 1};
                int x = 5;
                int maxDiffIndex = 0;
                int maxDiff = 0;
                for (int i = 0; i < array.length - 1; i++) {
                    int diff = Math.abs(array[i] - array[i+1]);
                    if (diff > maxDiff) {
                        maxDiff = diff;
                        maxDiffIndex = i;
                    }
                }
                System.out.println("O par de posições consecutivas com maior diferença é (" + maxDiffIndex + ", " + (maxDiffIndex + 1) + ")");
                
                // b. Verifique e imprima se o array está em ordem crescente, decrescente ou não ordenado;
                boolean isAscending = true;
                boolean isDescending = true;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i-1]) {
                        isAscending = false;
                    }
                    if (array[i] > array[i-1]) {
                        isDescending = false;
                    }
                }
                if (isAscending) {
                    System.out.println("O array está em ordem crescente.");
                } else if (isDescending) {
                    System.out.println("O array está em ordem decrescente.");
                } else {
                    System.out.println("O array não está ordenado.");
                }
                
                // c. Apresente quantos números no array são maiores que X, menores que X e iguais a X.
                int greaterCount = 0;
                int lesserCount = 0;
                int equalCount = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > x) {
                        greaterCount++;
                    } else if (array[i] < x) {
                        lesserCount++;
                    } else {
                        equalCount++;
                    }
                }
                System.out.println("Existem " + greaterCount + " números maiores que " + x);
                System.out.println("Existem " + lesserCount + " números menores que " + x);
                System.out.println("Existem " + equalCount + " números iguais a " + x);
        
    }
}

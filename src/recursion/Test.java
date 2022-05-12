package recursion;

public class Test {

    public void recorrerArray(int[] Array, int index) {
        if (index < Array.length) {
            System.out.print(Array[index] + ", ");
            recorrerArray(Array, index + 1);
        }
    }

    public static int getParPositivo() {
        int n = 1;
        do {
            n = (int) (Math.random() * 50 + 2);
        } while (n % 2 == 1);
        return n;
    }

    public static int getParNegativo() {
        int n = 1;
        do {
            n = (int) (Math.random() * 50 + 2);
        } while (n % 2 == 1);
        return n * -1;
    }

    public static int getImparNegativo() {
        int n = 0;
        do {
            n = (int) (Math.random() * 50 + 2);
        } while (n % 2 == 0);
        return n * -1;
    }

    public static int getImparPositivo() {
        int n = 0;
        do {
            n = (int) (Math.random() * 50 + 2);
        } while (n % 2 == 0);
        return n;
    }

    public static void main(String[] args) {
        int Planos = (int) (Math.random() * 10 + 5) + 1;
        int Filas = (int) (Math.random() * 6 + 3) + 1;
        int Columnas = (int) (Math.random() * 4 + 2) + 1;
        int[][][] array = new int[Planos][Filas][Columnas];
        int b = Columnas;
        for (int i = 0; i < Planos; i++) {
            for (int j = 0; j < Filas; j++) {
                b = (int) (Math.random() * 4 + 2) + 1;
                for (int k = 0; k < b; k++) {
                    if (j % 2 == 0 && k % 2 == 0) {
                        array[i][j][k] = getParPositivo();
                    }
                    if (j % 2 == 0 && k % 2 == 1) {
                        array[i][j][k] = getParNegativo();
                    }
                    if (j % 2 == 1 && k % 2 == 0) {
                        array[i][j][k] = getImparPositivo();
                    }
                    if (j % 2 == 1 && k % 2 == 1) {
                        array[i][j][k] = getImparNegativo();
                    }
                }
            }
        }

        for (int i = 0; i < Planos; i++) {
            for (int j = 0; j < Filas; j++) {
                for (int k = 0; k < b; k++) {
                    if (array[i][j][k] != 0) {
                        System.out.print("[" + array[i][j][k] + "]");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

package recursion;

import javax.swing.JTextArea;

public class Recursion {

    public boolean esPrimo(int n, int i, int cont) {
        if (n % i == 0) {
            cont++;
        }
        if (i == n) {
            return cont == 2;
        }
        return esPrimo(n, i + 1, cont);
    }

    public int generarPrimos(int n, int i, int array[], int index) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            if (esPrimo(i, 1, 0)) {
                array[index] = i;
                return i;
            }
        }
        if (esPrimo(i, 1, 0)) {
            array[index] = i;
            return generarPrimos(n - 1, i + 1, array, index + 1);
        } else {
            return generarPrimos(n, i + 1, array, index);
        }
    }

    public int sumaDeNumeros(int n) {
        if (n == 1) {
            return n;
        }
        return n + sumaDeNumeros(n - 1);
    }

    public int sumaDeNumerosPares(int n) {
        if (n == 1) {
            return n * 2;
        }
        return (n * 2) + sumaDeNumerosPares(n - 1);
    }

    public int sumaDeNumerosImpares(int n) {
        if (n == 1) {
            return n * 2 - 1;
        }
        return (n * 2 - 1) + sumaDeNumerosImpares(n - 1);
    }

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int fibonacciForDummies(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 0;
        }
        return fibonacciForDummies(n - 1) + fibonacciForDummies(n - 2);
    }

    public int multiplicar(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a + multiplicar(a, b - 1);
    }

    public int potencia(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a * potencia(a, b - 1);
    }

    public int invertir(int n, int length) {
        if (n < 10) {
            return n;
        }
        return n % 10 * potencia(10, length) + invertir(n / 10, length - 1);
    }

    public int contarDigitos(int n) {
        if (n == 0 || n < 10) {
            return n;
        }
        return 1 + contarDigitos(n / 10);
    }

    public int contarDigitosPares(int n) {
        if (n == 0) {
            return 0;
        }
        int digito = n % 10;
        if (digito == 2 || digito == 4 || digito == 6 || digito == 8 || digito == 0) {
            return 1 + contarDigitosPares(n / 10);
        }
        return contarDigitosPares(n / 10);
    }

    public int sumarDigitosFactoriales(int n) {
        if (n == 0) {
            return 0;
        }
        return factorial(n % 10) + sumarDigitosFactoriales(n / 10);
    }

    public int sumarFactoriales(int n) {
        if (n <= 1) {
            return n;
        }
        return factorial(n) + sumarFactoriales(n - 1);
    }

    public int sumarDigitosFactorialesPares(int n) {
        if (n == 0) {
            return 0;
        }
        int digito = n % 10;
        if (digito == 2 || digito == 4 || digito == 6 || digito == 8 || digito == 0) {
            return factorial(n % 10) + sumarDigitosFactorialesPares(n / 10);
        }
        return sumarDigitosFactorialesPares(n / 10);
    }

    public int sumarDigitosFactorialesImpares(int n) {
        if (n == 0) {
            return 0;
        }
        int digito = n % 10;
        if (digito == 1 || digito == 3 || digito == 5 || digito == 7 || digito == 9) {
            return factorial(n % 10) + sumarDigitosFactorialesImpares(n / 10);
        }
        return sumarDigitosFactorialesImpares(n / 10);
    }

    public int sumarFactorialesPares(int n) {
        if (n == 1) {
            return factorial(n * 2);
        }
        return factorial(n * 2) + sumarFactorialesPares(n - 1);
    }

    public int sumarFactorialesImpares(int n) {
        if (n == 1) {
            return factorial(n * 2 - 1);
        }
        return factorial(n * 2 - 1) + sumarFactorialesImpares(n - 1);
    }

    // Ejercicios de la practica
    public int divisores(int n, int i) {
        if (n == i) {
            return 1;
        }
        if (n % i == 0) {
            return 1 + divisores(n, i + 1);
        }
        return divisores(n, i + 1);
    }

    public int divisores(int n, int i, JTextArea show) {
        if (n == i) {
            show.append(n + " total: ");
            return 1;
        }
        if (n % i == 0) {
            show.append(i + ", ");
            return 1 + divisores(n, i + 1, show);
        }
        return divisores(n, i + 1, show);
    }

    public float primeraSerie(float n, int i) {
        if (n == 1) {
            return 1 / (n * n);
        }
        if (n % 2 == 0) {
            return primeraSerie(n - 1, i + 1) + (1 / (n * n));
        }
        return primeraSerie(n - 1, i + 1) - (1 / (n * n));
    }

    public float primeraSerie(float n, int i, JTextArea show) {
        if (n == 1) {
            show.append(1 + "/" + i + "^2 = ");
            return 1 / (n * n);
        }
        if (n % 2 == 0) {
            show.append(1 + "/" + i + "^2 + ");
            return primeraSerie(n - 1, i + 1, show) - (1 / (n * n));
        }
        show.append(1 + "/" + i + "^2 - ");
        return primeraSerie(n - 1, i + 1, show) + (1 / (n * n));
    }

    public float inversion(float monto, int n, float interes) {
        if (n == 1) {
            return monto + monto * (interes / 100);
        }
        return monto * (interes / 100) + inversion(monto, n - 1, interes);
    }

    public int segundaSerie(int n, int x) {
        if (n == 1) {
            return factorial(n * 2 + x);
        }
        return factorial(n * 2 + x) + segundaSerie(n - 1, x);
    }

    public int segundaSerie(int n, int x, int i, JTextArea show) {
        if (n == 1) {
            show.append("(" + i + " + " + x + ")! = ");
            return factorial(n * 2 + x);
        }
        show.append("(" + i + " + " + x + ")! + ");
        return factorial(n * 2 + x) + segundaSerie(n - 1, x, i + 2, show);
    }

    public int sumaDeDigitosPrimos(int n) {
        if (n == 0) {
            return n;
        }
        if (esPrimo(n % 10, 1, 0)) {
            return n % 10 + sumaDeDigitosPrimos(n / 10);
        }
        return sumaDeDigitosPrimos(n / 10);
    }

    public float division(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (a < b) {
            return 0;
        }
        return 1 + division(a - b, b);
    }

    public void sumaDeArrays(int[] a, int[] b, int[] c, int index) {
        if (index == a.length - 1) {
            c[index] = a[index] + b[index];
        } else {
            c[index] = a[index] + b[index];
            sumaDeArrays(a, b, c, index + 1);
        }
    }

    public void generarArray(int[] a, int index) {
        int random = (int) (Math.random() * 10 + 1);
        if (index == a.length - 1) {
            a[index] = random;
        } else {
            a[index] = random;
            generarArray(a, index + 1);
        }
    }

    public void generarArraySucesivo(int[] a, int index) {
        if (index == a.length - 1) {
            a[index] = index + 1;
        } else {
            a[index] = index + 1;
            generarArraySucesivo(a, index + 1);
        }
    }

    public void generarSerieConArray(int[] a, int index, int j, int x, int b) {
        if (index < a.length) {
            if (j < x) {
                j++;
            } else {
                j = 1;
                x++;
            }
            a[index] = b;
            if (j < x) {
                b = 0;
            } else {
                b = x;
            }
            generarSerieConArray(a, index + 1, j, x, b);
        }
    }

    public void mostrarArray(int[] a, int index) {
        if (index == a.length - 1) {
            System.out.println(a[index]);
        } else {
            System.out.print(a[index] + ", ");
            mostrarArray(a, index + 1);
        }
    }

    public void mostrarArray(int[] a, int index, JTextArea show) {
        if (index == a.length - 1) {
            show.append(a[index] + "");
        } else {
            show.append(a[index] + ", ");
            mostrarArray(a, index + 1, show);
        }
    }

    // refactor!!
    public void sumaDeMatrices(int[][] a, int[][] b, int[][] c, int filas) {
        if (filas == a.length - 1) {
            sumaDeArrays(a[filas], b[filas], c[filas], 0);
        } else {
            sumaDeArrays(a[filas], b[filas], c[filas], 0);
            sumaDeMatrices(a, b, c, filas + 1);
        }
    }

    public void generarMatriz(int[][] a, int filas) {
        if (filas == a.length - 1) {
            generarArray(a[filas], 0);
        } else {
            generarArray(a[filas], 0);
            generarMatriz(a, filas + 1);
        }
    }

    public void generarMatrizSucesiva(int[][] a, int filas, int columnas, int count) {
        if (filas < a.length) {
            if (columnas < a[0].length) {
                a[filas][columnas] = count;
                generarMatrizSucesiva(a, filas, columnas + 1, count + 1);
            } else {
                generarMatrizSucesiva(a, filas + 1, 0, count);
            }
        }
    }

    public void mostrarMatriz(int[][] a, int filas, int columnas) {
        if (filas < a.length) {
            if (columnas < a[0].length) {
                if (a[filas][columnas] < 10) {
                    System.out.print("[" + a[filas][columnas] + " ]");
                } else {
                    System.out.print("[" + a[filas][columnas] + "]");
                }
                mostrarMatriz(a, filas, columnas + 1);
            } else {
                System.out.println("");
                mostrarMatriz(a, filas + 1, 0);
            }
        }
    }

    public void mostrarMatriz(int[][] a, int filas, int columnas, JTextArea show) {
        if (filas < a.length) {
            if (columnas < a[0].length) {
                if (a[filas][columnas] < 10) {
                    show.append("[" + a[filas][columnas] + " ]");
                } else {
                    show.append("[" + a[filas][columnas] + "]");
                }
                mostrarMatriz(a, filas, columnas + 1, show);
            } else {
                show.append("\n");
                mostrarMatriz(a, filas + 1, 0, show);
            }
        }
    }

    /*
    public void sumaSniky(int[][] a, int[][] b, int[][] c, int n, int fil, int col) {
        if (fil == 0 && col == 0) {
            c[0][0] = a[0][0] + b[0][0];
        } else {
            if (col >= 0) {
                c[fil][col] = a[fil][col] + b[fil][col];
                sumaSniky(a, b, c, n, fil, col - 1);
            } else {
                col = n;
                sumaSniky(a, b, c, n, fil - 1, col);
            }
        }
    }
     */
    public void matrizTriangularSuperior(int[][] a, int filas, int columnas, int count) {
        if (filas < a.length) {
            if (columnas < a[0].length) {
                if (filas + columnas < a.length) {
                    a[filas][columnas] = count;
                    matrizTriangularSuperior(a, filas, columnas + 1, count + 1);
                } else {
                    matrizTriangularSuperior(a, filas, columnas + 1, count);
                }
            } else {
                matrizTriangularSuperior(a, filas + 1, 0, count);
            }
        }
    }

    public void matrizTriangularInferior(int[][] a, int filas, int columnas, int count) {
        if (filas < a.length) {
            if (columnas < a[0].length) {
                if (filas + columnas >= a.length - 1) {
                    a[filas][columnas] = count;
                    matrizTriangularInferior(a, filas, columnas + 1, count + 1);
                } else {
                    matrizTriangularInferior(a, filas, columnas + 1, count);
                }
            } else {
                matrizTriangularInferior(a, filas + 1, 0, count);
            }
        }
    }

    public void generarMatrizFilasIntercaladas(int[][] a, int filas, int columnas, int count) {
        if (columnas < a[0].length) {
            if (filas < a.length) {
                a[filas][columnas] = count;
                generarMatrizFilasIntercaladas(a, filas + 1, columnas, count + 1);
            } else {
                generarMatrizFilasIntercaladas(a, 0, columnas + 1, count);
            }
        }
    }

    public void generarMatrizGusanitoVertical(int[][] a, int filas, int columnas, int count) {
        if (columnas < a[0].length) {
            if (filas < a.length) {
                if (columnas % 2 == 0) {
                    a[filas][columnas] = count;
                    generarMatrizGusanitoVertical(a, filas + 1, columnas, count + 1);
                } else {
                    a[Math.abs(filas - a.length) - 1][columnas] = count;
                    generarMatrizGusanitoVertical(a, filas + 1, columnas, count + 1);
                }
            } else {
                generarMatrizGusanitoVertical(a, 0, columnas + 1, count);
            }
        }
    }

    public void matrizL(int[][] a, int filas, int columnas, int count) {
        if (filas < a.length) {
            if (columnas < a[0].length) {
                if (filas == 0 || columnas == a[0].length - 1) {
                    a[filas][Math.abs(columnas - a[0].length) - 1] = count;
                    matrizL(a, filas, columnas + 1, count + 1);
                } else {
                    matrizL(a, filas, columnas + 1, count);
                }
            } else {
                matrizL(a, filas + 1, 0, count);
            }
        }
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        int filas = 3, columnas = 3;

        int[][] matrizA = new int[filas][columnas];
        //int[] array = new int[10];
        //r.generarSerieConArray(array, 0, 1, 1, 1);
        //r.mostrarArray(array, 0);
    }

}

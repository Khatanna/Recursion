package recursion;

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

    public float primeraSerie(float n) {
        if (n == 1) {
            return 1 / (n * n);
        }
        if (n % 2 == 1) {
            return primeraSerie(n - 1) + (1 / (n * n));
        }
        return primeraSerie(n - 1) - (1 / (n * n));
    }

    public float inversion(float monto, int n, float interes) {
        if (n == 1) {
            return monto + monto * (interes / 100);
        }
        return monto * (interes / 100) + inversion(monto, n - 1, interes);
    }

    public int segundaSerie(int n, int x) {
        if (n == 1) {
            return n * 2 + factorial(x);
        }
        return 1 + (n * 2 + segundaSerie(n - 1, x));
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
}

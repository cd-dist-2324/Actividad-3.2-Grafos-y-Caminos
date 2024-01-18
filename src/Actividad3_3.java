

public class Actividad3_3 {

    // apartado 1 division
    public float calcularDivision(float dividendo, float divisor) throws Exception {

        if (divisor == 0) {

            throw (new Exception("Error. El divisor no puede ser 0."));

        }

        float resultado = dividendo / divisor;

        return resultado;

    }

    // apartado 2
    public float factorial(byte n) throws Exception {

        if (n < 0) {

            throw new Exception("Error. El número tiene que ser >=0");

        }

        float resultado = 1;

        for (int i = 2; i <= n; i++) {

            resultado *= i;

        }

        return resultado;

    }

    // apartado 3
    public boolean busca(char c, char[] v) {

        int a, z, m;

        a = 0;

        z = v.length - 1;

        boolean resultado = false;

        while (a <= z && resultado == false) {

            m = (a + z) / 2;

            if (v[m] == c) {

                resultado = true;

            }

            else

            {

                if (v[m] < c) {

                    a = m + 1;

                }

                else {

                    z = m - 1;

                }

            }

        }

        return resultado;

    }

    // apartado 4
    public String obtenerAcronimo(String cadena) {

        String resultado = "";

        char caracter;

        int n = cadena.length();

        for (int i = 0; i < n; i++) {

            caracter = cadena.charAt(i);

            if (caracter != ' ') {

                if (i == 0) {

                    resultado = resultado + caracter + '.';

                }

                else {

                    if (cadena.charAt(i - 1) == ' ') {

                        resultado = resultado + caracter + '.';

                    }

                }

            }

        }

        return resultado;

    }

    public static void main(String[] args) throws Exception {

        App app = new App();
        float resultado_division = app.calcularDivision(3, 2);

        byte entrada = 3;
        float resultado_factorial = app.factorial(entrada);

        boolean encontrado = app.busca('p', "Busco una p".toCharArray());

        String acronimo = app.obtenerAcronimo("Formación Profesional");

        System.out.println("Resultado 1: " + resultado_division);
        System.out.println("Resultado 2: El factorial de " + entrada  + " es: " + resultado_factorial);
        System.out.println("Resultado 3: " + encontrado);
        System.out.println("Resultado 4: " + acronimo);
    }

}

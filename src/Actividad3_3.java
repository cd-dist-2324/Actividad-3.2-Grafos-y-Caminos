

public class Actividad3_3 {

    // apartado 1 division
    /**
     * Calcula el resultado de dividir dividendo entre divisor
     * @param dividendo
     * @param divisor
     * @return resultado de la división
     * @throws Exception Se lanza una excepción cuando el divisor es cero
     */
    public float calcularDivision(float dividendo, float divisor) throws Exception {

        if (divisor == 0) {

            throw (new Exception("Error. El divisor no puede ser 0."));

        }

        float resultado = dividendo / divisor;

        return resultado;

    }

    // apartado 2
    /**
     * Calcula el factorial de un número n
     * @param n
     * @return el factorial de n
     * @throws Exception Se lanza una excepción si n<0
     */
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
    /**
     * Recibe un carácter c y una matriz de caracteres v de como máximo 10 elementos ordenados en orden ascendente.
     * La búsqueda es dicotómica, es decir, la  búsqueda se realiza calculando el índice mitad del segmento (en principio todo el array) y comparando c con el elemento almacenado en ese índice; si coincide, la búsqueda finaliza y se encuentra el carácter en la matriz; si c es menor, el siguiente segmento será la primera mitad del actual; si c es mayor, el siguiente segmento será la segunda mitad del actual. Si este proceso termina con un segmento nulo y no se encuentra el carácter, no existe y se devolverá false
     * @param c carácter c
     * @param v  matriz de caracteres v de como máximo 10 elementos ordenados en orden ascendente
     * @return   Devuelve el valor booleano verdadero o falso dependiendo de si el carácter se encuentra en la matriz o no.
     */
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
    /**
     * Recibe una cadena de caracteres y devuelve una cadena con el acrónimo correspondiente. 
     * @param cadena de entrada
     * @return El acrónimo está formado por el primer carácter de cada palabra seguido de un punto cuando el carácter es diferente del espacio en blanco.
     */
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

        Actividad3_3 app = new Actividad3_3();
        float resultado_division = app.calcularDivision(3, 2);

        byte entrada = 3;
        float resultado_factorial = app.factorial(entrada);

        boolean encontrado = app.busca('p', "acfhiprt".toCharArray());

        String acronimo = app.obtenerAcronimo("Formación Profesional");

        System.out.println("Resultado 1: " + resultado_division);
        System.out.println("Resultado 2: El factorial de " + entrada  + " es: " + resultado_factorial);
        System.out.println("Resultado 3: " + encontrado);
        System.out.println("Resultado 4: " + acronimo);
    }

}

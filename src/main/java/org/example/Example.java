package org.example;

public class Example {

        // 1. Método para sumar dos números
        public int sumar(int a, int b) {
            return a + b;
        }

        // 2. Método que lanza una excepción si el argumento es negativo
        public boolean checkPositivo(int numero) {
            if (numero < 0) {
                throw new IllegalArgumentException("El número no puede ser negativo");
            }
            return true;
        }

        // 3. Método para contar el número de letras 'a' en una cadena
        public int contarLetrasA(String cadena) {
            return (int) cadena.chars()
                    .filter(letra -> letra == 'a')
                    .count();
        }

        // 4. Método para obtener el mayor de dos números
        public int obtenerMayor(int x, int y) {
            return (x > y) ? x : y;
        }

        // 5. Método que verifica si una cadena está vacía
        public boolean esCadenaVacia(String texto) {
            return texto == null || texto.isEmpty();
        }
    }



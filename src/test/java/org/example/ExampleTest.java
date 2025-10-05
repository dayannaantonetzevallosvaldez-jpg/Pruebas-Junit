package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
        public void testSumar()
    {
        //Given
        Example example =new Example();

        int numeroA=1;
        int numeroB=5;

        //When
        int resultado= example.sumar(numeroA, numeroB);

        //Then
    assertEquals(6, resultado);

    }
    @Test
    public void testCheckPositivo (){
        //Given
        Example example = new Example();
        int numero=5;

        //When

        boolean resultado= example.checkPositivo(numero);

        //then
        assertEquals(true, resultado);
        assertTrue(resultado);

    }
    @Test
    public void testCheckPositivoNegativo(){

        Example example =new Example();
         int numero=-5;

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> example.checkPositivo(numero)
        );
         assertEquals("El número no puede ser negativo",exception.getMessage());

    }
    @Test
    public void testcontarLetrasA(){
        Example example= new Example();

        String name="dayanna";

        int resultado= example.contarLetrasA(name);

        assertEquals(3,resultado);
        assertNotNull(resultado);

    }

    @Test
    public void testObtenerMayor(){

        Example example = new Example();

        assertEquals(10, example.obtenerMayor(10, 5));
        assertEquals(20, example.obtenerMayor(15, 20));
        assertEquals(7, example.obtenerMayor(7, 7)); // cuando son iguales
    }

    @Test
    public void testEsCadenaVacia() {

        Example example = new Example();
        String texto="";

        boolean resultado = example.esCadenaVacia(texto);

        assertTrue(resultado);
    }
}

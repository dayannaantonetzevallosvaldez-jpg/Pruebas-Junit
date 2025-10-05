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



}

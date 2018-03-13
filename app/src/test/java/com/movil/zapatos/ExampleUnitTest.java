package com.movil.zapatos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void precioZapatillaMujerNike(){
        double precio = Metodos.Calcular(1,0,1,1);
        assertEquals(100000,precio,0);
    }
    @Test
    public void precioClasicoMujerPuma(){
        double precio = Metodos.Calcular(1,2,0,1);
        assertEquals(120000,precio,0);
    }
    @Test
    public void precioZapatillasHombreAdidas(){
        double precio = Metodos.Calcular(0,1,1,1);
        assertEquals(140000,precio,0);
    }
    @Test
    public void precioClasicoHombreNike(){
        double precio = Metodos.Calcular(0,0,0,1);
        assertEquals(50000,precio,0);
    }
}
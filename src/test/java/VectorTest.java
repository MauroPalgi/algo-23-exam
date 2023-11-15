import com.example.examen.Practicos;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTest {
    @Test
    void mostrarv_DeberiaDevolverCadenaCorrecta_Caso1() {
        int[] vector = {6, 3, 5, 1, 8, 7, 2, 4};
        String resultado = Practicos.mostrarv(vector);
        assertEquals("6 - 3 - 5 - 1 - 8 - 7 - 2 - 4", resultado);
    }

    @Test
    void mostrarv_DeberiaDevolverCadenaCorrecta_Caso2() {
        int[] vector = {1, 2, 3, 4, 5};
        String resultado = Practicos.mostrarv(vector);
        assertEquals("1 - 2 - 3 - 4 - 5", resultado);
    }

    @Test
    void mostrarv_DeberiaDevolverCadenaVacia_CasoVectorVacio() {
        int[] vector = {};
        String resultado = Practicos.mostrarv(vector);
        assertEquals("", resultado);
    }

    @Test
    void mostrarv_DeberiaDevolverUnSoloElemento_CasoUnElemento() {
        int[] vector = {42};
        String resultado = Practicos.mostrarv(vector);
        assertEquals("42", resultado);
    }
}

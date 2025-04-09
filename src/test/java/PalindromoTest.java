import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {
    @Test
    void deveRetornarTrueParaPalindromoSimples() {
        assertTrue(ValidadorPalindromo.isPalindromo("ana"));
        assertTrue(ValidadorPalindromo.isPalindromo("ovo"));
    }

    @Test
    void deveRetornarTrueParaFrasePalindroma() {
        assertTrue(ValidadorPalindromo.isPalindromo("Ame a ema"));
        assertTrue(ValidadorPalindromo.isPalindromo("Socorram-me subi no ônibus em Marrocos"));
    }

    @Test
    void deveRetornarFalseParaNaoPalindromo() {
        assertFalse(ValidadorPalindromo.isPalindromo("banana"));
        assertFalse(ValidadorPalindromo.isPalindromo("palindromo"));
    }
}

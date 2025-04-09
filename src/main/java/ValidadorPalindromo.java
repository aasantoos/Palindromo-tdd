public class ValidadorPalindromo {
    public static boolean isPalindromo(String texto) {
        if (texto == null) return false;
        String textoLimpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String invertido = new StringBuilder(textoLimpo).reverse().toString();
        return textoLimpo.equals(invertido);
    }
}

package generics;

public class ArrayUtilsGenerics {
    public static <T> T getElemento(T[] array, int index) {
        if(index >= array.length || index < 0) {
            return null;
        }
        return array[index];
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        String[] strings = {"texto1", "texto2", "texto3"};

        Integer primeiroElemento = getElemento(integers, 0);
        System.out.println("Primeiro objeto: " + primeiroElemento);

        String primeiroTexto = getElemento(strings, 0);
        System.out.println("Primeiro texto: " + primeiroTexto);
    }
}

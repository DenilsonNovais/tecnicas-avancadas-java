import java.util.ArrayList;
import java.util.List;

class Lista<T> {
    private List<T> lista = new ArrayList<>();

    public void adicionar(T elemento) {
        lista.add(elemento);
    }

    public T obter(int indice) {
        return lista.get(indice);
    }
}

public class ListaSemGenerics {
    public static void main(String[] args) {
        Lista<Integer> numeros = new Lista<>();
        numeros.adicionar(1);
        numeros.adicionar(2);
        Lista<String> textos = new Lista<>();
        textos.adicionar("Olá");
        textos.adicionar("Mundo");

        int numero = numeros.obter(0);
        System.out.println(numero);
        String texto = textos.obter(0);
        System.out.println(texto);
    }
}

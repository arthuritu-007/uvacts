import java.util.*;
//Hola soy jordi paul y tengo mas años que ustedes
public class OrdenarPorLongitud {
    public static List<String> ordenarPorLongitud(List<String> lista) {
        lista.sort(Comparator.comparingInt(String::length));
        return lista;
    }
    
    public static void main(String[] args) {
        List<String> programas = Arrays.asList("Hola", "soy", "Jordi", "Paul");
        List<String> ordenados = ordenarPorLongitud(new ArrayList<>(programas));
        System.out.println(ordenados);
    }
}

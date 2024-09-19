import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class obj2 {
    public static int[] uniao(int[] vetor1, int[] vetor2) {
        Set<Integer> conjunto = new HashSet<>();
        for (int elemento : vetor1) {
            conjunto.add(elemento);
        }
        for (int elemento : vetor2) {
            conjunto.add(elemento);
        }
        return conjunto.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] interseccao(int[] vetor1, int[] vetor2) {
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();
        for (int elemento : vetor1) {
            conjunto1.add(elemento);
        }
        for (int elemento : vetor2) {
            conjunto2.add(elemento);
        }
        conjunto1.retainAll(conjunto2);
        return conjunto1.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] complemento(int[] vetor1, int[] vetor2) {
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();
        for (int elemento : vetor1) {
            conjunto1.add(elemento);
        }
        for (int elemento : vetor2) {
            conjunto2.add(elemento);
        }
        conjunto1.removeAll(conjunto2);
        return conjunto1.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] insercaoUnicos(int[] vetor, int elemento) {
        Set<Integer> conjunto = new HashSet<>();
        for (int elem : vetor) {
            conjunto.add(elem);
        }
        conjunto.add(elemento);
        return conjunto.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] formacaoVetorUnico(int[] vetor) {
        Set<Integer> conjunto = new HashSet<>();
        for (int elemento : vetor) {
            conjunto.add(elemento);
        }
        return conjunto.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] classificacaoVetorUnico(int[] vetor) {
        Arrays.sort(vetor);
        return vetor;
    }
}
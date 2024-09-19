import java.util.Arrays;

public class tentar {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

    // Chamar o método uniao
    int[] unionResult = obj2.uniao(array1, array2);
    System.out.println("União dos vetores: " + Arrays.toString(unionResult));

    // Chamar o método interseccao
    int[] intersectionResult = obj2.interseccao(array1, array2);
    System.out.println("Intersecção de vetores: " + Arrays.toString(intersectionResult));

    // Chamar o método complemento
    int[] complementResult = obj2.complemento(array1, array2);
    System.out.println("Complementos: " + Arrays.toString(complementResult));

    // Chamar o método insercaoUnicos
    int[] insertUniqueResult = obj2.insercaoUnicos(array1, 6);
    System.out.println("Inserção de vetores: " + Arrays.toString(insertUniqueResult));

    // Chamar o método formacaoVetorUnico
    int[] uniqueArrayResult = obj2.formacaoVetorUnico(array1);
    System.out.println("Formação de vetores únicos: " + Arrays.toString(uniqueArrayResult));

    // Chamar o método classificacaoVetorUnico
    int[] sortArrayResult = obj2.classificacaoVetorUnico(array1);
    System.out.println("Classificação dos vetores únicos: " + Arrays.toString(sortArrayResult));
}
}

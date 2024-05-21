package application;

import java.util.ArrayList;
import java.util.List;
import entities.ListComparator;


public class Program {

	public static void main(String[] args) {

		List<Integer> lista1 = ListComparator.lista1;
        List<Integer> lista2 = ListComparator.lista2;
        
        List<Integer> indicesDiferentes = encontrarCnpjsDiferentes(lista1, lista2);
        
        List<Integer> listaIndicesDistintos = new ArrayList<>();
        
        for (Integer indice : indicesDiferentes) {
            listaIndicesDistintos.add(lista2.get(indice));
        }
        
        if (!listaIndicesDistintos.isEmpty()) {
            System.out.println("Os seguintes índices têm elementos diferentes:");
            listaIndicesDistintos.forEach(System.out::println);
        } else {
            System.out.println("As listas são iguais em todos os índices.");
        }

	}

	private static List<Integer> encontrarCnpjsDiferentes(List<Integer> lista1, List<Integer> lista2) {
		List<Integer> cnpjsDiferentes = new ArrayList<>();
		
		for (int i = 0; i < lista1.size(); i++) {
            if (!lista1.get(i).equals(lista2.get(i))) {
                cnpjsDiferentes.add(i);
            }
        }

        return cnpjsDiferentes;
		
	}


}

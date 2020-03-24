package Application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import Entities.Product;

public class ProgramSET {

	public static void main(String[] args) {
		
		
		System.out.println();
		System.out.println("===========SET- TRABALHA COM CONJUNTOS===================================");
		System.out.println("CONJUNTO EXEMPLO: TV , Notebook , Tablet");
		System.out.println();
		
		System.out.println("HASHSET (MAIS RÁPIDO) - Não mantem a ordem do conjunto de elementos");
		System.out.println();
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println();
		
		System.out.println("TREESET (MAIS LENTO) - Ordena o conjunto de elementos");
		System.out.println();
				
		Set<String> set1 = new TreeSet<>();
		
		set1.add("TV");
		set1.add("Notebook");
		set1.add("Tablet");
				
		for (String p : set1) {
			System.out.println(p);
		}
		
		
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println();
		
		System.out.println("LINKEDHASHSET (INTERMEDIARIO) - Mantem a Orden que os elementos foram inseridos");
		System.out.println();
		
		Set<String> set2 = new LinkedHashSet<>();
		
		set2.add("TV");
		set2.add("Notebook");
		set2.add("Tablet");
				
		for (String p : set2) {
			System.out.println(p);
		}
		
		
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println();
		
		System.out.println("ALGUMS COMANDOS SET");
		System.out.println();
		
		System.out.println("COMANDO REMOVE - remover o Tablet"); 
		
		set2.remove("Tablet");
		
		for (String p : set2) {
			System.out.println(p);
		}
		
		set2.add("Tablet"); 
		
		System.out.println();
		System.out.println("COMANDO REMOVEIF - Teste p/ remover que possua tamanho maior que 3"); 
		
		set2.removeIf(x -> x.length() >= 3 );
		
		for (String p : set2) {
			System.out.println(p);
		}
		
		set2.add("Notebook");
		set2.add("Tablet");
		
		
		System.out.println();
		System.out.println("COMANDO REMOVEIF - Teste p/ remover items que iniciam por 'T' "); 
		
		set2.removeIf(x -> x.charAt(0) == 'T' );
		
		for (String p : set2) {
			System.out.println(p);
		}
		
		set2.add("TV");
		set2.add("Tablet");
		
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println();
		
		System.out.println("OPERAÇÕES COM CONJUNTOS");
		System.out.println("CONJUNTOS EXEMPLOS: A = (0,2,4,5,6,8,10)  B = (5,6,7,8,9,10)");
		System.out.println();
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		System.out.println();
		System.out.println("UNION - UNIÃO CONJUNTO A COM CONJUNTO B ");
		//union
		Set<Integer> c = new TreeSet<>(a); // CRIOU O CONJUNTO 'C' COM MESMOS VALORE DE 'A'
		c.addAll(b);
		System.out.println(c);
		
		System.out.println();
		System.out.println("INTERCECTION - INTERCECÇÃO CONJUNTO A COM CONJUNTO B ");
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		System.out.println();
		System.out.println("DIFFERENCE - DIFERENÇA CONJUNTO A COM CONJUNTO B ");
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
		
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println();
		
		System.out.println("TESTE DE IGUALDADE COM HASH");
		System.out.println();
		
		Set<Product> set3 = new HashSet<>();
		
		set3.add(new Product("TV", 900.0));
		set3.add(new Product("Notebook", 1200.0));
		set3.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		// TESTA O ENDRTRÇO DE MEMÓRIA. RETORNA TRUE. POIS FOI FEITA A IMPLEMENTAÇÃO DO EQUAL NA
		//CLASSE PRODUCTS, DAE A COMPARAÇÃO É POR VALOR. SE NÃO TIVESSE A IMPLEMENTAÇÃO RETORNARIA
		//FALSE POIS A COMPARAÇÃO SERIA POR ENDEREÇO DE MEMÓRIA.
		System.out.println(set3.contains(prod)); // TESTA O ENDRTRÇO DE MEMÓRIA. RETORNA TRUE.
		
		
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println();
		
		System.out.println("COMO TREESET COMPARA ELEMENTOS");
		System.out.println();
		
		Set<Product> set4 = new TreeSet<>();
		
		set4.add(new Product("TV", 900.0));
		set4.add(new Product("Notebook", 1200.0));
		set4.add(new Product("Tablet", 400.0));
		
		//PARA FUNCIONAR, A CLASSE PRODUCT TEM QUE TER UM IMPLEMENTAÇÃO DO COMPARABLE
		for (Product p : set4) {
			System.out.println(p);
		}
		
		
	}

}

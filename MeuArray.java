import java.util.ArrayList;

public class MeuArray {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();// O OBJETO DA ARRAY FICA ENTRE TAGS <>

		list.add("Julio");
		list.add("Array");
		list.add("LearningJava");

		System.out.println("Primeiro item: " + list.get(0));// VAI PRINTAR A ARRAY LIST NA POSIÇÃO 0, OU SEJA, JULIO
	
		System.out.println("Tamanho = " + list.size());//PRINT DO TAMANHO DA ARRAY LIST
	
		if(list.contains("LearningJava")) {//LIST.CONTAINS VERIFICA SE EXISTE ALGUMA STRING COM O NOME LEARNINGJAVA, NO CASO	
			System.out.println("CONTÉM LearningJava!!");
		}else {
			System.out.println("NÃO CONTÉM!!");
		}
		
		list.remove(2);//LIST.REMOVE REMOVE UM ITEM, NO CASO "LEARNINGJAVA"
		System.out.println("Tamanho = " + list.size());
		
		if(list.contains("LearningJava")) {//LIST.CONTAINS VERIFICA SE EXISTE ALGUMA STRING COM O NOME LEARNINGJAVA, NO CASO	
			System.out.println("CONTÉM LearningJava!!");
		}else {
			System.out.println("NÃO CONTÉM!!");//COMO REMOVEU UM ITEM DA LISTA ESTA REDUZ DE TAMANHO E LEARNINGJAVA É EXCLUÍDO
		}
	}
}

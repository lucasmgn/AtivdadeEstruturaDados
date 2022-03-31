package exerciciosLogica.basico.EstruturaDeDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Atividade4 {
	public static void main(String[] args) {
		
		  Queue<Object> fila = new LinkedBlockingQueue<>(10);
		  
		  Stack<Integer> pilha1 = new Stack<>();
		  
		  List<Integer> lista = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		  System.out.println(lista);
		  inserir(lista, fila, pilha1);
		  lista = new LinkedList<Integer>(Arrays.asList(6,7,8,9,10));
		  System.out.println(lista);
		  inserir(lista, fila, pilha1);
		  System.out.println(fila);
//		  na lista vc remove de qualquer posic, e na pilha vc so pode tirar o ultimo q foi inserido, 
		  //a lista o primeiro a entrar é o primeiro a sair
		  
		
		  
	}
	
	
	private static void inserir(List<Integer> lista, Queue<Object> fila, Stack<Integer> pilha1) {
		
		while(!lista.isEmpty()) {
			  int operacao = lista.remove(0);
//			  System.out.println("Valores na Lista" + lista);
			  pilha1.push(operacao);
//			  System.out.println("Valores na pilha" + pilha1);
		  }
		  
		  System.out.println("----------------");
		  while(!pilha1.isEmpty()) {
//			  System.out.println("Valores na pilha" + pilha1);
			  int operacao2 = pilha1.pop();
			  fila.add(operacao2);
//			  System.out.println("Valores na fila" + fila);
		  }
	}
}

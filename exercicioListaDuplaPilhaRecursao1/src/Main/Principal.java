package Main;

import Basica.Contato;
import Lista.Lista;

public class Principal {
	public static void main(String[] args) {
	Lista listaContatos = new Lista();
	
	Contato c1 = new Contato("Ivan", "Rua do Sol, 222, Centro, Ratanaba - AM", "92 98765-4123");
	Contato c2 = new Contato("Iracema", "Rua do Mar, 333, Centro, Ratanaba - AM", "92 99989-9988");
	Contato c3 = new Contato("Edwês", "Rua do Sal, 444, Centro, Ratanaba - AM", "92 98799-9695");
	Contato c4 = new Contato("Andressa", "Rua da Maré, 555, Centro, Ratanaba - AM", "92 98632-5412");
	
	listaContatos.adicionarNoFim(c1);
	listaContatos.adicionarNoInicio(c2);
	listaContatos.adicionarNoInicio(c3);
	listaContatos.adicionarNoInicio(c4);
	
	System.out.println("Lista de contatos: ");
	listaContatos.imprimir();

	Contato c5 = new Contato("Lívia", "Rua das Flores, 777, Centro, Ratanaba - AM", "92 98888-1212");
    listaContatos.adiconarPorPosicao(2, c5);
    System.out.println("_____________________\n");
    System.out.println("Lista de contatos atualizada com adiconar por posição: ");
    listaContatos.imprimir();
    
	listaContatos.excluirFim();
	System.out.println("_____________________\n");
	System.out.println("Lista de contatos atualizada com excluir fim: ");
	listaContatos.imprimir();
	
	listaContatos.excluirInicio();
	System.out.println("_____________________\n");
	System.out.println("Lista de contatos atualizada com excluir inicio: ");
	listaContatos.imprimir();
	
	listaContatos.excluirPorPosicao(3);
	System.out.println("_____________________\n");
	System.out.println("Lista de contatos atualizada por excluir por posição: ");
	listaContatos.imprimir();

	}

}

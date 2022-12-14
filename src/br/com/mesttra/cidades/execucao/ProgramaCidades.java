package br.com.mesttra.cidades.execucao;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.mesttra.cidades.dao.CidadeDAO;
import br.com.mesttra.cidades.pojo.CidadePOJO;

public class ProgramaCidades {

	private static void insercao(CidadeDAO cidadeDao, Scanner teclado) {
		System.out.println(" -- Inserção de Cidade -- ");
		System.out.println(" ## Digite o DDD ## ");
		int ddd = teclado.nextInt();
		teclado.nextLine();

		System.out.println(" ## Digite o nome da cidade ## ");
		String nome = teclado.nextLine();

		System.out.println(" ## Digite a quantidade de habitantes ## ");
		int nroHabitantes = teclado.nextInt();

		System.out.println(" ## Digite a renda per capita ## ");
		double rendaPerCapita = teclado.nextDouble();

		System.out.println(" ## Digite 0 caso seja uma capital e 1 caso não seja ## ");
		boolean capital = teclado.nextInt() == 0;
		teclado.nextLine();

		System.out.println(" ## Digite a sigla do estado ## ");
		String estado = teclado.nextLine();

		System.out.println(" ## Digite o nome do Prefeito(a) ## ");
		String nomePrefeito = teclado.nextLine();

		CidadePOJO cidadeInserida = new CidadePOJO(ddd, nome, nroHabitantes, rendaPerCapita, capital, estado,
				nomePrefeito);
		if (cidadeDao.insereCidade(cidadeInserida)) {
			System.out.println(" ## Cidade inserida com sucesso ## ");
		}
	}

	private static void remocao(CidadeDAO cidadeDao, Scanner teclado) {
		System.out.println(" -- Remocao de Cidade -- ");
		System.out.println(" ## Digite o DDD ## ");

		int ddd = teclado.nextInt();
		if (cidadeDao.removeCidade(ddd)) {
			System.out.println(" ## Cidade removida com sucesso ## ");
		}
	}

	public static void main(String[] args) {

		CidadeDAO cidadeDao = new CidadeDAO();

		// CidadePOJO ipojuca = new
		// CidadePOJO(81,"Ipojuca",100000,130000,false,"PE","Celia");
		// cidadeDao.insereCidade(ipojuca);

		// cidadeDao.removeCidade(81);
		// System.out.println("FIM");
		Scanner teclado = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println(" -- GESTAO DE CIDADES -- ");
			System.out.println(" ## Digite a opcao escolhida ## ");
			System.out.println("1  - Para inserir uma cidade");
			System.out.println("2  - Para remover uma cidade pelo ddd");
			System.out.println("3  - Listar cidades");
			System.out.println("4  - Para consultar uma cidade pelo ddd");
			System.out.println("5  - Listar cidades que começam com um texto digitado");
			System.out.println("6  - Listar cidades por estado");
			System.out.println("7  - Mostrar a quantidade de cidades por estado");
			System.out.println("8  - Listar cidades que sejam capitais ou não");
			System.out.println("-1 - Para encerrar o programa");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				try {
					insercao(cidadeDao, teclado);
				} catch (InputMismatchException e) {
					System.err.println("Erro ao ler os dados da cidade, refaça a operação.");
					teclado.nextLine();
				}
				break;
			case 2:
				try {
					remocao(cidadeDao, teclado);
				} catch (InputMismatchException e) {
					System.err.println("Erro ao ler o ddd, digit um número inteiro.");
					teclado.nextLine();
				}
				break;
			case 3:
				listagem(cidadeDao);
				break;
			case 4:
//					2. Crie no seu DAO um método que é capaz de retornar uma cidade com base no seu número de ddd.
				consultaCidade(cidadeDao, teclado);
				break;
			case 5:
//					3. Crie um método que é capaz de pesquisar cidades cujos nomes se iniciam por um texto
//					passado como parâmetro.
				listaCidadesQueComecamCom(cidadeDao, teclado);
				break;
			case 6:
//					4. Crie um método que é capaz de listar cidades filtradas pela sigla de estado.
				listaCidadesPorEstado(cidadeDao, teclado);
				break;
			case 7:
//					5. Crie um método que recebe a sigla de um estado e retorna a quantidade de cidades daquele estado.
				contaCidadesPorEstado(cidadeDao, teclado);
				break;
			case 8:
//					7. Crie um método que filtra cidades pela coluna capital, onde o valor do filtro é passado como parâmetro.
				listaCapitaisOuInterior(cidadeDao, teclado);
				break;
			default:
				break;
			}

		} while (opcao != -1);

		teclado.close();
		System.out.println("Obrigado por utilizar o nosso sistema!");

	}

}

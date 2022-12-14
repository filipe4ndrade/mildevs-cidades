# mildevs-cidades

Instruções do Exercício:

PARTE 1:

1. Construa sua fábrica de conexões e estabeleça conexão com o banco de dados mildevs, teste essa conexão utilizando um programa principal.

2. Represente a tabela cidade(ddd*, nome, nro_habitantes, renda_per_capita, capital**, estado, nome_prefeito) com um POJO. 
	*PK 
	**capital é um booleano.

3. Crie um DAO para cidades e crie um método de inserção de cidades.

4. Crie no seu  DAO um método de remoção por DDD.

5. Crie no seu programa principal menu para cadastro de cidades, que peça ao usuário todos os dados e que no fim o insira no banco de dados, este programa deve 
avaliar se os dados inseridos correspondem ao tipo pedido e tratar este comportamento. Também será possível remover uma cidade pelo DDD através dessa interface..

PARTE 2:

1. Crie no seu CidadeDAO o método de listagem de cidades sem filtros.

2. Crie no seu DAO um método que é capaz de retornar uma cidade com base no seu número de ddd.

3. Crie um método que é capaz de pesquisar cidades cujos nomes se iniciam por um texto
passado como parâmetro.

4. Crie um método que é capaz de listar cidades filtradas pela sigla de estado.

5. Crie um método que recebe a sigla de um estado e retorna a quantidade de cidades daquele estado.

6. Provavelmente neste momento você já repetiu bastante o while (rs.next) e a construção da cidade, que tal criar um método privado que seja genérico e utilizá-lo em seus outros métodos de listagem?

7. Crie um método que filtra cidades pela coluna capital, onde o valor do filtro é passado como parâmetro.

8. Modifique seu menu (Programa Principal) para ser capaz de utilizar as novas funcionalidades.


package br.com.mesttra.cidades.execucao;

import br.com.mesttra.cidades.dao.CidadeDAO;
import br.com.mesttra.cidades.pojo.CidadePOJO;

public class ProgramaCidades {

	public static void main(String[] args) {
		
		CidadeDAO cidadeDao = new CidadeDAO();
		
		CidadePOJO ipojuca = new CidadePOJO(81,"Ipojuca",100000,130000,false,"PE","Celia");
		
		cidadeDao.insereCidade(ipojuca);

	}

}

package br.com.mesttra.cidades.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.mesttra.cidades.connectionfactory.ConnectionFactory;
import br.com.mesttra.cidades.pojo.CidadePOJO;

public class CidadeDAO {

	//INSERT INTO public.cidade(
	// ddd, nome, nro_habitantes, renda_per_capita, capital, estado, nome_prefeito)
	// VALUES (?, ?, ?, ?, ?, ?, ?);

	private Connection conn;

	public CidadeDAO() {
		this.conn = ConnectionFactory.getConnection();
	}
	
	public boolean insereCidade(CidadePOJO cidade) {
		
		String sql = "INSERT INTO public.cidade("
				+ "ddd, nome, nro_habitantes, renda_per_capita, capital, estado, nome_prefeito)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?);";
		
		try {
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			stmt.setInt(1, cidade.getDdd());
			stmt.setString(2, cidade.getNome());
			stmt.setInt(3, cidade.getNroHabitantes());
			stmt.setDouble(4, cidade.getRendaPerCapita());
			stmt.setBoolean(5, cidade.isCapital());
			stmt.setString(6, cidade.getEstado());
			stmt.setString(7, cidade.getNomePrefeito());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.err.println("Erro ao realizar inserção");
			System.err.println(e.getMessage());
			return false;
		}
	   
		return true;
	}

}

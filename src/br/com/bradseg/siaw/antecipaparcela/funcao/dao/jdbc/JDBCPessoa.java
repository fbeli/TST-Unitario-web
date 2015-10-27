package br.com.bradseg.siaw.antecipaparcela.funcao.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//@Repository("jdbcDao")
public class JDBCPessoa extends JDBCBaseDao{

	
	
	//@Qualifier("dataSourceJDBC")
	DataSource dataSource;
	
	public JDBCPessoa() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Busca DDDProduto através do DDD
	 * @param ddd
	 * @return
	 */
	public List<Pessoa> getPessoas(String nome){
			
		Object[] parametros = {nome};
		List<Pessoa> lPessoa = getJdbcTemplate()
				.query("select * from pessoa where nome = ?",parametros,
					new RowMapper<Pessoa>(){
						public Pessoa mapRow(ResultSet rs, int rowNum) throws SQLException{
						Pessoa pessoa = new Pessoa();
						pessoa.setId(rs.getInt("id"));
						pessoa.setNome(rs.getString("nome"));
						pessoa.setCpf(rs.getString("cpf"));
						return pessoa;
					}});
		if(lPessoa.size()<1)
			return null;
		return lPessoa;
	}
	


	
}

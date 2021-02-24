package br.com.mvccourse.dao;

import org.springframework.stereotype.Repository;

import br.com.mvccourse.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

	@Override
	public Funcionario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

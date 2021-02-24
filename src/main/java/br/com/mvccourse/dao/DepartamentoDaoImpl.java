package br.com.mvccourse.dao;

import org.springframework.stereotype.Repository;

import br.com.mvccourse.domain.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao{

	@Override
	public Departamento findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

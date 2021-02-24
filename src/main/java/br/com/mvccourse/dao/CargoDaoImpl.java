package br.com.mvccourse.dao;

import org.springframework.stereotype.Repository;

import br.com.mvccourse.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

	@Override
	public Cargo findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

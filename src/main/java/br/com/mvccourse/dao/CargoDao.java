package br.com.mvccourse.dao;

import java.util.List;

import br.com.mvccourse.domain.Cargo;

public interface CargoDao {
	
	void save(Cargo departamento);
	
	void update(Cargo departamento);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();

}

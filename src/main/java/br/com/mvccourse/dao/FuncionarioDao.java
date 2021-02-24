package br.com.mvccourse.dao;

import java.util.List;

import br.com.mvccourse.domain.Funcionario;

public interface FuncionarioDao {
	
	void save(Funcionario departamento);
	
	void update(Funcionario departamento);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();

}

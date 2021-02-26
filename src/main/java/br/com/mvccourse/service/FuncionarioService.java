package br.com.mvccourse.service;

import java.util.List;

import br.com.mvccourse.domain.Funcionario;

public interface FuncionarioService {
	
void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);

	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();

}

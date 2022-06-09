package br.com.novatendencia.LancamentoaixCa.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.novatendencia.LancamentoaixCa.models.Lancamento;

public interface LancamentosRepo extends CrudRepository<Lancamento, Integer>  {
	
}
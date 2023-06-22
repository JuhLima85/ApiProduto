package br.com.kafka.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kafka.Model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	
	ProdutoModel findById(long id);

}
	
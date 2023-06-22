package br.com.kafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kafka.Model.ProdutoModel;
import br.com.kafka.Repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*")
public class ProdutoControleler {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	@ApiOperation(value="Retorna uma lista de produtos")
    public List<ProdutoModel> listaProdutos(){
    	return produtoRepository.findAll();
    }
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um produto único")
    public ProdutoModel listaProdutoUnico(@PathVariable(value="id") long id){
    	return produtoRepository.findById(id);
}
	
	@PostMapping("/produto")
	@ApiOperation(value="Salva um produto")
	public ProdutoModel salvarProduto (@RequestBody ProdutoModel produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produto")
	@ApiOperation(value="Deleta um produto")
	public void deltaProduto (@RequestBody ProdutoModel produto) {
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produto")
	@ApiOperation(value="Atualiza um produto")
	public ProdutoModel atualizaProduto (@RequestBody ProdutoModel produto) {
		return produtoRepository.save(produto);
	}
}	
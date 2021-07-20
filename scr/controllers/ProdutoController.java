package controllers;

import java.util.ArrayList;

import models.Categoria;
import models.Colecao;
import models.Fornecedor;
import models.Produto;

public class ProdutoController {

	private static ArrayList<Produto> produtos = new ArrayList<>();

	//Cadastrar
	public static void cadastrar(Produto produto){
		produtos.add(produto);
	}

	//Listar todos os produtos
	public static ArrayList<Produto> listar(){
		return produtos;
	}

	//Buscar produto por nome 
	public static Produto buscarPorNome(String nome){
		for(Produto produtoCadastrado: produtos){
			if (produtoCadastrado.getNomeProduto().equals(nome)){
				return produtoCadastrado;
			}
		}
		return null;    
	}
	
	//Buscar produto por c�digo
	public static Produto buscarPorCodigo(String codigoProduto){
		for(Produto produtoCadastrado: produtos){
			if (produtoCadastrado.getCodigoProduto().equals(codigoProduto)){
				return produtoCadastrado;
			}
		}
		return null;    
	}

	//Editar produto
	public static Boolean editar (String codigoProduto, String novoCodigo, String novoNome, Categoria novaCategoria, Colecao novaColecao, Fornecedor novoFornecedor) {
		for(Produto produtoCadastrado: produtos) {
			if(produtoCadastrado.getCodigoProduto().equals(codigoProduto)) {
				if(novoCodigo != null){
					produtoCadastrado.setCodigoProduto(novoCodigo);
				}
				if(novoNome != null){
					produtoCadastrado.setNomeProduto(novoNome);
				}
				if(novaCategoria != null){
					produtoCadastrado.setCategoriaProduto(novaCategoria);
				}
				if(novaColecao != null){
					produtoCadastrado.setColecao(novaColecao);
				}
				if(novoFornecedor != null){
					produtoCadastrado.setFornecedor(novoFornecedor);
				}
				return true;
			}
		}
		return false;
	}

	//Deletar produto
	public static Boolean deletar(String codigoProduto){ 
		for(Produto produtoCadastrado: produtos) {
			if(produtoCadastrado.getCodigoProduto().equals(codigoProduto)) {
				produtos.remove(produtoCadastrado);
				return true;
			}
		}
		return false;
	}
}

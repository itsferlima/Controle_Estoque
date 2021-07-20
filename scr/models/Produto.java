package models;

import java.util.Date;

public class Produto {
	
	private String codigoProduto;
    private String nomeProduto;
    private Categoria categoriaProduto;
    private Colecao colecao;
    private Fornecedor fornecedor;
    private int qntdEstoque;
    private Date criadoEm;
    
    public Produto() {
        setCriadoEm(new Date());
        this.qntdEstoque = 0; 
        
    }

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Categoria getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(Categoria categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
    
    public Colecao getColecao() {
		return colecao;
	}

	public void setColecao(Colecao colecao) {
		this.colecao = colecao;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getQntdEstoque() {
		return qntdEstoque;
	}

	public void setQntdEstoque(int qntdEstoque) {
		this.qntdEstoque = qntdEstoque;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Override
	public String toString() {
		return "\nCodigo Produto:" + codigoProduto + "\nNome Produto:" + nomeProduto + "\nCategoria Produto:"
				+ categoriaProduto + "\nColecao:" + colecao + "\nFornecedor:" + fornecedor.getEmpresa() + "\nQuantidade em Estoque:" + qntdEstoque + "\ncriadoEm:"
				+ criadoEm;
	}
	
}

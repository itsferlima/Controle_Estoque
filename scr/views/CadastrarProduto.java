import java.util.Scanner;

import scr.controllers.CategoriaController;
import scr.controllers.ProdutoController;
import scr.models.Produto;

public class CadastrarProduto{
    private static Produto produto;
    private static String nomeColecao;
    private static Produto nomeCategoria;
    private static Colecao colecao;
    private static Categoria categoria;
    private static String cnpjFornecedor;
    private static Fornecedor fornecedor;
    private static Scanner print = new Scanner(System.in);

    public static void renderizar(){

        produto = new Produto();
        print = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("\n--CADASTRAR PRODUTO--\n");
        System.out.println("Digite o codigo do produto:");
        String codigoProduto = print.next();
        if(ProdutoController.buscarPorCodigo(codigoProduto) == null){
            produto.setCodigoProduto(codigoProduto);
            System.out.println("Digite o nome do produto:");
            produto.setNomeProduto(print.next());

            System.out.println("Digite a categoria do produto");
            nomeCategoria = print.next();
            categoria = CategoriaController.buscarPorNome(nomeCategoria);
            if(categoria != null){
                produto.setCategoriaProduto(categoria);

                System.out.println("Digite a coleção a qual o produto pertence");
                nomeColecao = print.next();
                if(colecao != null){
                    produto.setColecao(colecao);

                    System.out.println("Digite o CNPJ fornecedor:");
                    cnpjFornecedor= print.next();
                    fornecedor = FornecedorController.buscarPorCnpj(cnpjFornecedor);
                    if(fornecedor != null){
                        produto.setFornecedor(fornecedor);

                        ProdutoController.cadastrar(produto);
                        System.out.println("\nProduto cadastrado com sucesso!!");
                    }else{
                        System.out.println("Este CNPJ não esta cadastrado!");
                    }
                }else {
                    System.out.println("Digite uma colecao valida!");
                }
            }else{
                System.out.println("Digite uma categoria valida!!");
            }
        }else{
            System.out.println("\nUm produto com este codigo já existe");
        }
    }   
}
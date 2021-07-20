package views;

import java.util.Scanner;

import scr.controllers.CategoriaController;
import scr.controllers.ProdutoController;
import scr.controllers.FornecedorController;
import scr.controllers.ProdutoController;
import scr.models.Categoria;
import scr.models.Colecao;
import scr.models.Fornecedor;
import scr.models.Produto;

public class EditarProduto{
    private static Scanner print = new Scanner(System.in);
    private static String codigoProduto;
    private static Produto produto;
    private static String novoCodigo = null;
    private static String novoNome = null;
    private static Categoria categoria = null;
    private static Categoria novaColecao = null;
    private static Colecao colecao = null;
    private static Fornecedor fornecedor = null;
    private static Fornecedor novofornecedor = null;

    public static void renderizar(){
        produto = new Produto();

        System.out.println("\nDigite o codigo do produto");
        codigoProduto = print.next();
        produto = ProdutoController.buscarPorCodigo(codigoProduto);

        if(produto != null){
            int op;
            do{
                System.out.println("\nSelecione o item a ser editado:");
                System.out.println("1- Codigo do produto");
                System.out.println("2- Nome do produto");
                System.out.println("3- Categoria do produto");
                System.out.println("4- Colecao do produto");
                System.out.println("5- Fornecedor do produto");
                System.out.println("0- Voltar");

                op = print.nextInt();
                switch(op){
                case 1:
                    System.out.println("\nDigite o novo codigo do produto");
                    novoCodigo = print.next();
                    System.out.println("\nCodigo do produto alterado com sucesso");
                    break;
                case 2:
                    System.out.println("\nDigite o novo nome do produto");
                    novoNome = print.next();
                    System.out.println("\nNome do produto alterado com sucesso");
                    break;
                case 3:
                    System.out.println("\nDigite o nome da categoria do produto");
                    var nomeCategoria = print.next();
                    categoria = CategoriaController.buscarPorNome(nomeCategoria);
                    if (categoria != null){
                        novaCategoria = categoria;
                        System.out.println("\nCategoria do produto alterado com sucesso");
                    }else {
                        System.out.println("\nCategoria não cadastra");
                    }
                    break;
                case 4:
                    System.out.println("\nDigite a nova coleção do produto");
                    var nomeColecao = print.next();
                    colecao = ColecaoController.buscarPorNome(nomeColecao);
                    if (colecao != null){
                        novaColecao = colecao;
                        System.out.println("\nColecao do produto alterado com sucesso");
                    }else {
                        System.out.println("\nColecao não cadastra");
                    }
                    break;
                case 5:
                    System.out.println("\nDigite CNPJ do novo forncedor do produto");
                    var novoCnpj = print.next();
                    fornecedor = FornecedorController.buscarPorNome(novoCnpj);
                    if (fornecedor != null){
                         novoFornecedor = fornecedor;
                    }else {
                            System.out.println("\nEste CNPJ não se encontra cadastrado");
                        }
                    break;
                case 0: 
                    System.out.println("\nVoltando");
                    break;
                default:
                    System.out.println("\nDigite uma opcao valida\n");
                }

            }while(op != 0);
            ProdutoController.editar(codigoProduto, novoCodigo, novoNome, novaCategoria,novaColecao, novofornecedor);
         }else{
            System.out.println("\nEste produto não existe\n");
        }
    }
}
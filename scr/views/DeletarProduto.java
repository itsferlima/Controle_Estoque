package views;

import java.util.Scanner;

import scr.controllers.ProdutoController;
import models.Produto;

public class DeletarProduto{
    private static Scanner print = new Scanner(System.in);
    private static Produto produto;

    public static void renderizar(){
        produto = new Produto();

        System.out.println("\nDigite o codigo do produto que deseja deletar");
        String codigoProduto = print.next();
        produto = ProdutoController.buscarPorCodigo(codigoProduto);
        if(produto != null){
            if(ProdutoController.deletar(codigoProduto)){
                System.out.println("\nProduto excluido com sucesso");
            }
        }else {
            System.out.println("\nEste produto não existe");
        }
    }
}
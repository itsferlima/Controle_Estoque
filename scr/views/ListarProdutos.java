package views;

import scr.controllers.ProdutoController;
import scr.models.Produto;

public class ListarProdutos{
    public static void renderizar(){
        System.out.println("\n--LISTAR PRODUTOS--");

        for(Produto produtoCadasProduto: ProdutoController.listar()){
            System.out.println("\n"+produtoCadasProduto);
        }
    }
}
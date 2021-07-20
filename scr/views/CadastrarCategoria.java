package views;
import java.util.Scanner;

import controllers.CategoriaController;
import controllers.FornecedorController;
import controllers.ProdutoController;
import models.Categoria;

public class CadastrarCategoria {
    
    private static Categoria categoria;
     private static Scanner print = new Scanner(System.in);
        
     public static void renderizar() {
         
        categoria = new Categoria();
             
        System.out.println("\n");
        System.out.println("\n-- CADASTRAR CATEGORIA --  \n");
        System.out.println("Digite o nome da CATEGORIA:");
        String nomeCategoria = print.next();
        if (CategoriaController.buscarPorNome(nomeCategoria) == null) {
            categoria.setNome(nomeCategoria);
            
            CategoriaController.cadastrar(categoria);
            System.out.println("\nCategoria cadastrada com sucesso!");
             
        }else {
            System.out.println("\nERRO!\nJ� existe uma categoria com esse nome!");
        }
    }
}
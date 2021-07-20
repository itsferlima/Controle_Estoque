package views;

import java.util.Scanner;

public class MenuProduto{
    private static Scanner print = new Scanner(System.in);

    public static void renderizar(){

        int op;
        do{
            System.out.println("\n".repeat(2));
            System.out.println("-- MENU PRODUTO --");
            System.out.println("\n1. Cadastrar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Alterar produtos");
            System.out.println("4. Deletar produtos");
            System.out.println("5. Listar por coleção os produtos");
            System.out.println("0. Voltar ao menu anterior");
            op=TratamentoExcecao.lerInteiro("\nDigite a opção desejada: ");

            switch(op){
            case 1:
                CadastrarProduto.renderizar();
                break;
            case 2:
                ListarProduto.renderizar();
                break;
            case 3:
                EditarProduto.renderizar();
                break;
            case 4:
                DeletarProduto.renderizar();
                break;
            case 5:
                ListarPorColecao.renderizar();
                break;
            case 0:
                System.out.println("\nVoltando...");
                break;
            default:
                System.out.println("\nOpcao invalida...");
                break;
            }
        }while (op != 0);
    }
}
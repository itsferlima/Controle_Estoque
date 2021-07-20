package controllers;

import java.util.ArrayList;
import models.Categoria;

public class CategoriaController{
    private static ArrayList<Categoria> categorias = new ArrayList<>();

    //Cadastrar categoria
    public static void cadastrar (Categoria categoria){
        categoria.add(categoria);
    }

    //Listar todos os produtos
    public static Arraylist<Categoria> listar(){
        return categorias;
    }

    //Buscar categoria por nome
    public static Categoria buscarPorNome(String nome){
        for(Categoria categoriaCadastrada: cateforias){
            if(categoriaCadastrada.getNome().equals(nome)){
                return categoriaCadastrada;
            }
        }
        return null;
    }

    //Deletar categoria
    public static Boolean deletar(String nomeCategoria){
        for(Categoria categoriaCadastrada: categorias){
            if(categoriaCadastrada.getNome().equals(nomeCategoria)){
                categorias.remove(categoriaCadastrada);
                return true;
            }
        }

        return false;
    }
}
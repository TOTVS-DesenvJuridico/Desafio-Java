package br.com.totvs.juridico;

import dto.LivroDTO;
import java.util.ArrayList;

public class LivrariaApplication {
    ArrayList<LivroDTO> listLivros= new ArrayList<>();
    public static void main(String[] args){
        new LivrariaApplication();
    }

    public LivrariaApplication(){
        this.initLivros();
        this.criarUmNovoLivro("Arquitetura Limpa", "Tecnologia");
        this.criarUmNovoLivro("Harry Potter e a Camara secreta", "Fantasia");
        this.criarUmNovoLivro("WildCards", "Esportes");
        this.criarUmNovoLivro("O Trono do Sol", "Fantasia");
        System.out.println(this.listarLivrosFantasia());
    }

    public void initLivros(){
        this.listLivros.add(new LivroDTO( 0,  "Código Limpo", "Tecnologia"));
        this.listLivros.add(new LivroDTO( 1,  "Senhor do Anéis",  "Fantasia" ));
        this.listLivros.add(new LivroDTO( 2,  "WildCards", "Fantasia" ));
        this.listLivros.add(new LivroDTO( 3,  "Harry Potter e o Prisioneiro de Azkaban", "Fantasia" ));
        this.listLivros.add(new LivroDTO( 4,  "Javascript de alto desempenho", "Tecnologia" ));
        this.listLivros.add(new LivroDTO( 5,  "O poder da ação", "Administração" ));
    }

    public void criarUmNovoLivro(String nome, String genero){
        if (buscarLivro(nome, genero) == 0){
            LivroDTO novoLivro = new LivroDTO(this.listLivros.size(), nome, genero);
            this.listLivros.add(novoLivro);
        } else {
            /**
             * Monte a mensagem de erro avisando que já existe um Livro cadastrado sobre o nome e genero passados
             */
        }
    }

    public int buscarLivro(String nomeLivro, String genero){
        int indiceLivro = -1;

        for (int index = 0 ; index < this.listLivros.size(); index++){
            LivroDTO livro = this.listLivros.get(index);
            /**
             * Implemente a validação onde retorne o Indice do Livro caso encontre um com mesmo nome e genero
             */
        }
        return indiceLivro;
    }

    public String listarLivrosFantasia(){
        /**
         * Retorne uma String contendo todos os Livros que são de fantasia.
         */
    }
}

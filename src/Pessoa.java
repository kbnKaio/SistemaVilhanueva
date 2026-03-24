/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author u08016696180
 */
public class Pessoa {

    private String nome;
    private int idade;
    

    public Pessoa() {
        nome = "";
        idade = 0;
    }

    public void aniversario() {
        setIdade(getIdade() + 1);
        //idade++;

    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.aniversario();
        System.out.println("nome:" + pessoa.getNome());
        System.out.println("idade:" + pessoa.getIdade());

    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

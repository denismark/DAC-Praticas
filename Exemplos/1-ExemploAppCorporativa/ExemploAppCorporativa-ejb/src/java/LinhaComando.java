/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Pessoa
 */
public class LinhaComando {
    
    public static void main(String[] args) {
        
        System.out.println("Olá, seja bem-vindo ao sistema! :D\n");
        
        if (args.length < 1) {
            System.out.println("Digite uma das opções abaixo: \nautor - diz o autor do programa\ntime - diz o time que o autor torce\n");
        } else if (args[0].equals("autor")) {
            System.out.println("O autor do programa é Diego\n");
        } else if (args[0].equals("time")) {
            System.out.println("O time que Diego torce é o Flamengo\n");
        } 

	System.out.println("Alguma modificação simples!");

	System.out.println("Olá Diego, aqui é Denismark, testando o git");
	
	System.out.println("Meu time já jogou na 2ª Divisão do Campeonato Brasileiro");

	System.out.println("Testando novamente o GIT !!");
        
    }
    
}

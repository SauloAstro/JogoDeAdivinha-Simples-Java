/*
    Consiste em o programa gerar um número aleátorio desejado pelo 
    usuário e assim o usuário devera acertar o numero gerado
 */


import java.util.Scanner;
import java.util.Random;

public class JogoDeAdivinhacao {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in); // Ler Numeros;
		Scanner input = new Scanner(System.in); // Ler Textos;
		Random random = new Random();
		
	   int gerador_numero;
	   int palpite; 
	   int contador = 3;	
	   String op = "";
	   
	   do{
		   System.out.print("Digite o limite do numero gerado : ");
		   gerador_numero = random.nextInt(sc.nextInt());
		   System.out.println("Numero Gerado");
		   
		   for(int i = 0; i < contador; i++)
		   {
			  palpite = sc.nextInt();
			   
			   if(palpite == gerador_numero)
			   {
			    
			    System.out.print("Parabéns você acertou");
				System.exit(0);

		        }
		        else{
					 System.out.println("Você Errou tente novamente"); 
					  
					}
			   
			   
		   }
		   
		   System.out.print("Você perdeu todas as chances, quer continuar : " );
		   op = input.nextLine();
			
			
			
		   
		   
		   
		   
		   
		   }while(!op.equalsIgnoreCase("N"));
		
		
		
		
		
		
	}
}


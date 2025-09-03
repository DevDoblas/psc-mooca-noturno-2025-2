import java.util.Scanner;

public class DoWhile {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          //int  contador=1;
            //while(contador<=5){
               // System.out.println(contador);
    //contador++;
        int numero;
        do{
        System.out.println("Digite um numero para sair");
        numero = sc.nextInt();
        System.out.println("Você digitou "+ numero);

        }
        while (numero != 0);
    
        
        
        
        System.out.println("Programa encerrado");
        sc.close();
            }}
    
    
    
    
    
    
    
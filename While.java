import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //int  contador=1;
        //while(contador<=5){
           // System.out.println(contador);
//contador++;
    int numero;
    System.out.println("Digite um numero para sair");


    numero = sc.nextInt();
    while (numero != 0) {

        System.out.println("Você digitou "+ numero);
        System.out.println("Digite 0 para sair");
        numero = sc.nextInt();

    }
    System.out.println("Programa encerrado");
        }




    }



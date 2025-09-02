import javax.swing.JOptionPane;
 
  public class IfSimples {
        public static void main(String[] args) {
   
    int numero =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
           
     if (numero%2 == 0) {
        System.out.println("O número  "+ numero+" é par");
     } else{
        System.out.println("O número  "+ numero+" é Impar");
        
     }  
    }
 }

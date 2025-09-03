import javax.swing.JOptionPane;
public class SwitchCase {
    public static void main(String[] args) {
 String operador= JOptionPane.showInputDialog("Insira um operador (+,*,/,-)");   
int num = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1 numero")); 
int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2 numero")); 
double resultado;

switch (operador) {
    case "+":
        resultado= num1 + num ;
        JOptionPane.showMessageDialog(null, "Soma deu: "+ resultado );
       break;
       case "-":
        resultado= num1 - num ;
        JOptionPane.showMessageDialog(null, "Subtração deu :"+ resultado );
        case "*":
        resultado= num1 * num ;
        JOptionPane.showMessageDialog(null, "Multiplicação deu : "+ resultado );
       break;
       case "/" :
       if (num == 0) {
        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
    } else {
        resultado = (double) num1 / num;  // Casting para double para evitar divisão inteira
        JOptionPane.showMessageDialog(null, "Divisão deu: " + resultado);
    }
    break;
default:
    JOptionPane.showMessageDialog(null, "Operador inválido!");
    break;
    
}






    }
}

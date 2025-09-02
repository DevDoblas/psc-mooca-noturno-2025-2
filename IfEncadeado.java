import javax.swing.JOptionPane;

public class IfEncadeado {
    public static void main(String[] args) {
     
       double a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da  a1 "));
       double a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do a2 "));
        double a3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do a3 "));
    // double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno "));
       // int nota= a1+a2+a3 ;
      double media = a1+a2+a3;

       if (media>=70 && media <=100) {
        System.out.println("Você foi aprovado , sua nota é "+ media);
       } else if (media<50){
        System.out.println("Você  foi reprovado , sua nota é "+ media);
       }else if(media>100) {
        System.out.println("Nota inválida "+ media);
       } else {
        System.out.println("Você tá no meio , sua nota é "+ media);
        }

       }
    
}

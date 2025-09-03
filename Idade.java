import javax.swing.JOptionPane;


public class Idade {
    public static void main(String[] args) {
    
        int ano= 365;
int mes=30;
 int anos = 2025;
 int te = Integer.parseInt(JOptionPane.showInputDialog("Qual seu ano  de nascimento"));
 int t1e = Integer.parseInt(JOptionPane.showInputDialog("Qual seu mês de nascimento"));
 int t2e = Integer.parseInt(JOptionPane.showInputDialog("Qual seu dia de nascimento"));
int anoEmDias= (anos - te);
int mesEmDias = t1e*mes;
int todo= anoEmDias+mesEmDias+t2e;
}
}




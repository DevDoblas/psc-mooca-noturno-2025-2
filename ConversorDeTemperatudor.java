


import java.awt.GridLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class ConversorDeTemperatudor {

    public void criarTela() {
        JFrame tela = new JFrame("Conversor de Temperatura");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\u00B0C");
        JButton converterButton = new JButton("Converter");
        JLabel resultadoLabel = new JLabel("Resultado: ");

        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2, 2,4,4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(converterButton);
        painelDeConteudo.add(resultadoLabel);
     
     converterButton.addActionListener(e -> {
            
                double celsius = Double.parseDouble(celsiusTextField.getText());
                double fahrenheit = (celsius * 9/5) + 32;
                resultadoLabel.setText(String.format("Resultado: %.2f \u00B0F", fahrenheit));
            
        });

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(300, 100);
        tela.setVisible(true);

    }
}

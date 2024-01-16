import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JButton Botonresta;
    private JButton button4;
    private JButton button5;
    private JButton button7;
    private JButton Botonsuma;
    private JButton Botonmultiplicacion;
    private JButton Botondivision;
    private JButton button3;
    private JButton button6;
    private JButton button8;
    private JButton button15;
    private JButton button16;
    JPanel menuPrincipal;
    private JLabel resultadoLbl;
    private JTextField numero2textField;
    private JLabel numero1Lbl;
    private JLabel numero2Lbl;
    private JTextField numero1textField;
    private JLabel error;


    public Calculadora() {
        Botonsuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String r1;

                resultadoLbl.setText("Resultado:" +Integer.toString( Integer.parseInt(numero1textField.getText())
                        +Integer.parseInt(numero2textField.getText())));
            }
        });
        Botonresta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String r2;

                resultadoLbl.setText("Resultado: " + Integer.toString(Integer.parseInt(numero1textField.getText())
                        - Integer.parseInt(numero2textField.getText())));
            }
        });
        Botonmultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String r3;

                resultadoLbl.setText("Resultado: " + Integer.toString(Integer.parseInt(numero1textField.getText())
                        * Integer.parseInt(numero2textField.getText())));
            }
        });
        Botondivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String r4;

                try{
                    resultadoLbl.setText("Resultado: " + Integer.toString(Integer.parseInt(numero1textField.getText())
                            / Integer.parseInt(numero2textField.getText())));
                } catch (Exception ex){
                    Botondivision.setText("No se puede dividir para 0");
                }

            }
        });
    }
}
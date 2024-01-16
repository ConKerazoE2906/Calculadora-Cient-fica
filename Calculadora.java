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
    private JButton button6;
    private JButton button8;
    private JButton button15;
    private JButton button16;
    JPanel menuPrincipal;
    private JLabel resultadoLbl;
    private JTextField numero_dos_ingresado;
    private JLabel numero1Lbl;
    private JLabel numero2Lbl;
    private JTextField numero_uno_ingresado;
    private JLabel error;
    private JButton boton_raiz;
    private JButton boton_potencia;
    private JButton boton_porcentaje;
    private JButton boton_random;


    public Calculadora() {
        Botonsuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String r1;

                resultadoLbl.setText("Resultado:" +Integer.toString( Integer.parseInt(numero_uno_ingresado.getText())
                        +Integer.parseInt(numero_dos_ingresado.getText())));
            }
        });
        Botonresta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String r2;

                resultadoLbl.setText("Resultado: " + Integer.toString(Integer.parseInt(numero_uno_ingresado.getText())
                        - Integer.parseInt(numero_dos_ingresado.getText())));
            }
        });
        Botonmultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String r3;

                resultadoLbl.setText("Resultado: " + Integer.toString(Integer.parseInt(numero_uno_ingresado.getText())
                        * Integer.parseInt(numero_dos_ingresado.getText())));
            }
        });
        Botondivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String r4;

                try{
                    resultadoLbl.setText("Resultado: " + Integer.toString(Integer.parseInt(numero_uno_ingresado.getText())
                            / Integer.parseInt(numero_dos_ingresado.getText())));
                } catch (Exception ex){
                    Botondivision.setText("No se puede dividir para 0");
                }

            }
        });
        boton_potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int base=Integer.parseInt(numero_uno_ingresado.getText());
                int exponente=Integer.parseInt(numero_dos_ingresado.getText());
                double resultado_potencia = Math.pow(base,exponente);
                resultadoLbl.setText("Resultado: " +Double.toString(resultado_potencia));

            }
        });
        boton_raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int base=Integer.parseInt(numero_uno_ingresado.getText());
                int n=Integer.parseInt(numero_dos_ingresado.getText());
                double resulatdo_raiz = Math.pow(base,(1.0/n));
                resultadoLbl.setText("Resultado: " + Double.toString(resulatdo_raiz));
            }
        });
        boton_porcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n_uno=Integer.parseInt(numero_uno_ingresado.getText());
                int n_dos=Integer.parseInt(numero_dos_ingresado.getText());
                double resultado_porcentaje=((n_uno*100)/n_dos);
                resultadoLbl.setText("Resultado: "+ Double.toString(resultado_porcentaje));
            }
        });
        boton_random.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n_uno=Integer.parseInt(numero_uno_ingresado.getText());
                int n_dos=Integer.parseInt(numero_dos_ingresado.getText());
                double resultado_random=Math.random()*(n_dos-n_uno)+n_uno;
                resultadoLbl.setText("El numero aleatorio que sea generado es: "+Double.toString(resultado_random));
            }
        });
    }
}
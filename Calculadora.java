import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JButton Botonresta;
    private JButton boton_seno;
    private JButton button5;
    private JButton boton_coseno;
    private JButton Botonsuma;
    private JButton Botonmultiplicacion;
    private JButton Botondivision;
    private JButton button6;
    private JButton button8;
    private JButton boton_tangente;
    private JButton boton_pi;
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
        
        boton_pi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    if (!numero_uno_ingresado.getText().isEmpty() && !numero_dos_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_uno_ingresado.getText());
                        double num2=Double.parseDouble(numero_dos_ingresado.getText());
                        
                        double pi1=num1*Math.PI;
                        double pi2=num2*Math.PI;
    
                        String reslbl="Pi de %.2f: %.4f, Pi de %.2f: %.4f".formatted(num1, pi1, num2, pi2);
                        resultadoLbl.setText(reslbl);
                    }
                    else if (!numero_uno_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_uno_ingresado.getText());
    
                        double pi=num1*Math.PI;
    
                        String reslbl="Pi de %.2f: %.4f".formatted(num1, pi);
                        resultadoLbl.setText(reslbl);
                    }
                    else if (!numero_dos_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_dos_ingresado.getText());
    
                        double pi=num1*Math.PI;
    
                        String reslbl="Pi de %.2f: %.4f".formatted(num1, pi);
                        resultadoLbl.setText(reslbl);
                    }
                    else{
                        error.setText("ERROR: Ingrese un nnumero antes de usar esta funcion!");
                    }
                } catch (Exception exp) {
                    error.setText("ERROR: Ingrese valores numericos antes de continuar!");
                }
            }
        });

        boton_seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!numero_uno_ingresado.getText().isEmpty() && !numero_dos_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_uno_ingresado.getText());
                        double num2=Double.parseDouble(numero_dos_ingresado.getText());
                        
                        double senoNum1 = Math.sin(Math.toRadians(num1));
                        double senoNum2 = Math.sin(Math.toRadians(num2)); 
    
                        String reslbl="Seno de %.2f: %.4f, Seno de %.2f: %.4f".formatted(num1, senoNum1, num2, senoNum2);
                        resultadoLbl.setText(reslbl);
                    }
                    else if (!numero_uno_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_uno_ingresado.getText());
                        double senoNum1 = Math.sin(Math.toRadians(num1));
    
                        String reslbl="Seno de %.2f: %.4f".formatted(num1, senoNum1);
                        resultadoLbl.setText(reslbl);
                    }
                    else if (!numero_dos_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_dos_ingresado.getText());
                        double senoNum1 = Math.sin(Math.toRadians(num1));
                        
                        String reslbl="Seno de %.2f: %.4f".formatted(num1, senoNum1);
                        resultadoLbl.setText(reslbl);
                    }
                    else{
                        error.setText("ERROR: Ingrese un nnumero antes de usar esta funcion!");
                    }
                }
                catch (Exception exp) {
                    error.setText("ERROR: Ingrese valores numericos antes de continuar!");
                }
            }
        });

        boton_coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!numero_uno_ingresado.getText().isEmpty() && !numero_dos_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_uno_ingresado.getText());
                        double num2=Double.parseDouble(numero_dos_ingresado.getText());
                        
                        double cosenoNum1 = Math.cos(Math.toRadians(num1));
                        double cosenoNum2 = Math.cos(Math.toRadians(num2)); 
    
                        String reslbl="Coseno de %.2f: %.4f, Coseno de %.2f: %.4f".formatted(num1, cosenoNum1, num2, cosenoNum2);
                        resultadoLbl.setText(reslbl);
                    }
                    else if (!numero_uno_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_uno_ingresado.getText());
                        double cosenoNum1 = Math.sin(Math.toRadians(num1));
    
                        String reslbl="Coseno de %.2f: %.4f".formatted(num1, cosenoNum1);
                        resultadoLbl.setText(reslbl);
                    }
                    else if (!numero_dos_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_dos_ingresado.getText());
                        double cosenoNum1 = Math.sin(Math.toRadians(num1));
                        
                        String reslbl="Coseno de %.2f: %.4f".formatted(num1, cosenoNum1);
                        resultadoLbl.setText(reslbl);
                    }
                    else{
                        error.setText("ERROR: Ingrese un nnumero antes de usar esta funcion!");
                    }
                } catch (Exception exp) {
                    error.setText("ERROR: Ingrese valores numericos antes de continuar!");
                }
            }
        });

        boton_tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!numero_uno_ingresado.getText().isEmpty() && !numero_dos_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_uno_ingresado.getText());
                        double num2=Double.parseDouble(numero_dos_ingresado.getText());
                        
                        double tanNum1 = Math.tan(Math.toRadians(num1));
                        double tanNum2 = Math.tan(Math.toRadians(num2)); 
    
                        String reslbl="Tangente de %.2f: %.4f, Tangente de %.2f: %.4f".formatted(num1, tanNum1, num2, tanNum2);
                        resultadoLbl.setText(reslbl);
                    }
                    else if (!numero_uno_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_uno_ingresado.getText());
                        double tanNum1 = Math.tan(Math.toRadians(num1));
    
                        String reslbl="Tangente de %.2f: %.4f".formatted(num1, tanNum1);
                        resultadoLbl.setText(reslbl);
                    }
                    else if (!numero_dos_ingresado.getText().isEmpty()){
                        double num1=Double.parseDouble(numero_dos_ingresado.getText());
                        double tanNum1 = Math.tan(Math.toRadians(num1));
    
                        String reslbl="Tangente de %.2f: %.4f".formatted(num1, tanNum1);
                        resultadoLbl.setText(reslbl);
                    }
                    else{
                        error.setText("ERROR: Ingrese un nnumero antes de usar esta funcion!");
                    }
                } catch (Exception exp) {
                    error.setText("ERROR: Ingrese valores numericos antes de continuar!");
                }
            }
        });
    }
}
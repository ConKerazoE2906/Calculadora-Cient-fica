import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CALCULADORA CIENTIFICA");
        frame.setContentPane(new Calculadora().menuPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,640);
        frame.setVisible(true);
        frame.pack();


    }
}
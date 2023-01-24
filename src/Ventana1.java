import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana1 {
    private JPanel Menu;
    private JRadioButton boton_cat;
    private JRadioButton boton_dog;
    private JRadioButton boton_rabbit;
    private JRadioButton boton_pig;
    private JRadioButton boton_bird;
    private JPanel Panel_img;
    private JPanel panel_prin;
    private JTextField ingreso_ciudad;
    private JLabel menjs_ciudad;
    private JLabel imagen;

    public Ventana1() {
        //Bird
        boton_bird.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setText("Pajaro");
            }
        });

        boton_cat.addActionListener(new ActionListener() {
            //Cat
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setText("Gato");


            }
        });
        boton_dog.addActionListener(new ActionListener() {
            //Dog
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setText("Perro");
            }
        });
        boton_rabbit.addActionListener(new ActionListener() {
            //rabbit
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setText("Conejo");
            }
        });
        boton_pig.addActionListener(new ActionListener() {
            //pig
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setText("Cerdo");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Venta1");
        frame.setContentPane(new Ventana1().panel_prin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

package Controlador;

import Modelo.InsertarDatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AccionBoton implements ActionListener, ItemListener {

    JTextField caja1B;
    JButton boton1B;
    JButton boton2B;
    JComboBox combo1B;

    public AccionBoton(JTextField caja1, JButton boton1, JButton boton2, JComboBox combo1) {
        this.caja1B = caja1;
        this.boton1B = boton1;
        this.boton2B = boton2;
        this.combo1B = combo1;

        boton1.addActionListener(this);
        boton2.addActionListener(this);

        combo1B.addItemListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1B){

            if (caja1B.getText().equals("Palabras.txt")){
                combo1B.removeAllItems();
                combo1B = new InsertarDatos().InsertarCombo(combo1B);

            }else if (caja1B.getText().equals("Numeros.txt")){
                combo1B.removeAllItems();
                combo1B = new InsertarDatos().InsertarCombo2(combo1B);

            }

        }
        if (e.getSource() == boton2B){
            caja1B.setText("");
            combo1B.removeAllItems();
        }


    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}

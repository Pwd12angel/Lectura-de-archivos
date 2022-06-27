package Vista;

import Controlador.AccionBoton;
import Modelo.InsertarDatos;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    JLabel etiqueta1;
    JTextField caja1;

    JButton boton1;
    JButton boton2;

    JComboBox combo1;


    Font fuente = new Font("Calibri", 3, 20);
    public Panel(){
        this.setLayout(null);

        //Creamos metodos
        crearEtiqueta();
        crearCombo();
        crearBoton();

    }



    private void crearCombo() {

        combo1 = new JComboBox();

        combo1.setBounds(90,220,110,30);

        combo1.setFont(fuente);


        add(combo1);
       // add(combo2);
    }

    private void crearEtiqueta() {
        etiqueta1 = new JLabel("Nombre Archivo");
        caja1 = new JTextField();

        etiqueta1.setBounds(40,80,200,30);
        caja1.setBounds(190,80,200,30);

        etiqueta1.setFont(fuente);
        caja1.setFont(fuente);

        add(etiqueta1);
        add(caja1);


    }

    private void crearBoton() {

        boton1 = new JButton("Enviar");
        boton2 = new JButton("Borrar");

        boton1.setBounds(110,140,100,30);
        boton2.setBounds(250,140,100,30);

        boton1.setFont(fuente);
        boton2.setFont(fuente);

        add(boton1);
        add(boton2);

        AccionBoton instancai = new AccionBoton(caja1,boton1,boton2,combo1);

    }
}

package Modelo;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InsertarDatos {
    
     List<String> textoArchivo = new ArrayList<String>();
    List<String> textoArchivo2 = new ArrayList<String>();
    public JComboBox InsertarCombo(JComboBox combo1) {

        LecturaDelArchivo instancia = new LecturaDelArchivo();
        //igualamos el metodo
        try {
            textoArchivo = instancia.Leer(textoArchivo);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //impiamos el area
        combo1.addItem("Palabras");
        //argegamos el cntenido de la lista en el JTexArea
        for (int i = 0; i <textoArchivo.size(); i++) {
            combo1.addItem(textoArchivo.get(i));
        }
        return combo1;
    }
    public JComboBox InsertarCombo2(JComboBox combo2) {

        LecturaDelArchivo instancia2 = new LecturaDelArchivo();
        //igualamos el metodo
        try {
            textoArchivo2 = instancia2.Leer2(textoArchivo2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //impiamos el area
        combo2.addItem("Numeros");
        //argegamos el cntenido de la lista en el JTexArea
        for (int i = 0; i <textoArchivo2.size(); i++) {
            combo2.addItem(textoArchivo2.get(i));
        }
        return combo2;
    }
}

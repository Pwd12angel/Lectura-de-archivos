package Modelo;

import java.io.*;
import java.util.List;

public class LecturaDelArchivo {

    //Recibiremos la lista
    public List<String> Leer(List<String> textoArchivo) throws IOException {

        //Accedemos al archivo
        File documento = new File("C:/Users/tur27/OneDrive/Documentos/LeerArchivosTopicos/Palabras.txt");

        BufferedReader obj = null;

        try {
            obj = new BufferedReader(new FileReader(documento));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Guardamos cada uno de los parrafos en la lista
        String parrafo;

        while ((parrafo = obj.readLine()) != null){
            System.out.println(parrafo);
            //Agregamos el elemento a la lista
            textoArchivo.add(parrafo);
        }
        //retornamos el texto
        return textoArchivo;
    }

    public List<String> Leer2(List<String> textoArchivo2) throws IOException {

        //Accedemos al archivo
        File documento2 = new File("C:/Users/tur27/OneDrive/Documentos/LeerArchivosTopicos/Numeros.txt");

        BufferedReader obj2 = null;

        try {
            obj2 = new BufferedReader(new FileReader(documento2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Guardamos cada uno de los parrafos en la lista
        String parrafo1;

        while ((parrafo1 = obj2.readLine()) != null){
            System.out.println(parrafo1);
            //Agregamos el elemento a la lista
            textoArchivo2.add(parrafo1);
        }
        //retornamos el texto
        return textoArchivo2;
    }
}

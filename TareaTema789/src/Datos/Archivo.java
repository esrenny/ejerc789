package Datos;

import java.io.FileWriter;
import java.io.IOException;
    //CREACION DE UN FICHERO
    class Archivo {

    public static void main(String[] args) throws IOException {

        Archivo accede_es= new Archivo();
        accede_es.escribir();

    }

    public void escribir() throws IOException {
    String frase="Esto es una prueba de escritura";

       try{
        FileWriter escritura=new FileWriter("C:/Tareas/texto_nuevo.txt");

        for(int i=0; i<frase.length();i++){
            escritura.write(frase.charAt(i));
        }
        escritura.close();

    }catch(IOException e){
        e.printStackTrace();
    }

}}

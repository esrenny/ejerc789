import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();


        // 1.- Crear una cadena e invertirla


        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String cadena= scanner.nextLine();

        StringBuilder cadenaInv= new StringBuilder(cadena);

        cadena= cadenaInv.reverse().toString();

        System.out.println(cadena);



        // 2.-Crear un array de String unidimensional

        String nombres[]={
                "Primero",
                "Segundo",
                "Tercero",
                "Cuarto",
                "Quinto"};

        for (String i:nombres){

            System.out.println(i);


        }
        */
        // 3.- Array Bidimensional de enteros con recorrido con posicion y valor
        /*
        int [][] arrayBidi = {
                {3, 6, 9, 12, 15},
                {5, 10, 15, 20, 25},
        };

        for (int i=0; i<arrayBidi.length; i++){
            for(int j=0; j<arrayBidi[1].length; j++){
                System.out.println("Posicion " + (i) + "|" + (j) +
                        "\nEl valor es: " + arrayBidi[i][j] + "\n");
            }
        }

        // 4. Creacion de vector y eliminacion de 2 elementos
        Vector<Integer> vector=new Vector();

        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);
        vector.add(500);
        // vector inicial
        for (int i=0; i< vector.size();i++){
            System.out.println("Valor: " +vector.get(i)+ " en posicion:" + i);
        }
        vector.remove(2);
        vector.remove(1);
        // vector final
        for (int i=0; i< vector.size();i++){
            System.out.println("Valor: " +vector.get(i)+ " en posicion:" + i);
        }
            */

        // 5.- Se pierde mucha memoria porque la inicial es 10, y se debe duplicar cada vez que se sobrepasa.


        // 6.- Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando
        // únicamente el valor de cada elemento.

        /*
        ArrayList<String> arrayLista = new ArrayList<String>();

        arrayLista.add("Eduardo");
        arrayLista.add("Carlos");
        arrayLista.add("Maria");
        arrayLista.add("Sonia");

        LinkedList<String> listalinked = new LinkedList<String>();

        // Copiando arraylist en linkedlist

        for (int i = 0; i < arrayLista.size(); i++) {
            listalinked.add(i, arrayLista.get(i));
        }
        //Mostrando elementos

        System.out.println("Contenido de arraylist: "+arrayLista);
        System.out.println("Contenido de linkedlist: "+listalinked);


         */
        //7.- Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares.
        //Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos,
        // siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> arrayLista2 = new ArrayList<Integer>();

        //Bucle para adicionar valores

        for(int i=1; i<11; i++) {

            arrayLista2.add(i);
        }
            System.out.println("Valores iniciales " + arrayLista2);

        // Bucle para eliminar valores pares

        for (int posicion = 0; posicion < arrayLista2.size(); posicion++) {

            if (arrayLista2.get(posicion) % 2 == 0)
                arrayLista2.remove(posicion);
            }

            System.out.println("Valores finales "+ arrayLista2);





    }
}

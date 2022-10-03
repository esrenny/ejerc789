package excepciones;

import java.util.Scanner;
/*
8.- Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara
la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier
caso: "Demo de código".
 */


public class Excep {

    public static int cociente(int num, int den) throws ArithmeticException
    {
        return num/den;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Introduce un numerador:");
            int numerador=sc.nextInt();
            System.out.println("Introduce un denominador");
            int denominador=sc.nextInt();
            double resultado=Excep.cociente(numerador,denominador);
            System.out.println("La division es: " + resultado);

    }catch (ArithmeticException e){
        System.out.println("Esto no puede hacerse");}
        finally {
            System.out.println("Demo de codigo");
        }

}}


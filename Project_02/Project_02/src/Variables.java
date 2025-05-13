public class Variables 
{
    public static void main(String[] args) 
    {
        int numero1 = 10;
        double numero2;
        numero2 = 3.14; //Puede o no colocar una D o d al final del número
        float numero3;
        numero3 = 3.14159F; //Para que no se confunda que es un double se pone una F para que se convierta a Float
        char caracter1 = 'A', caracter2 = 65;
        boolean opcion = true;
        long numero4; //Puede requerir L o l al final del número
        numero4 = 987654321L;
        byte numero5 = 126;
        short numero6 = 128;
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println(numero6);
        System.out.println(caracter1);
        System.out.println(caracter2);
        System.out.println(opcion);

        //Variables de referencia 
        String mensaje, mensaje2;
        mensaje = "Esto es un mensaje";
        mensaje2 = """ 
                Este
                es 
                un mensaje
                multilinea
                """; //Este tipo de mensaje se debe de poner si o si las comillas en una linea sola 

        System.out.println(mensaje);
        System.out.println(mensaje2); 
        System.out.println(mensaje + ' ' + numero1); //Para concatenar las cosas y poner espacios debe de ser comillas simples y el espacio
        System.out.println(mensaje.toUpperCase());
        
        String numero1_string = Integer.toString(numero1); //Convertir enteros a caracteres 
        System.out.println(mensaje.concat(numero1_string));

        //Variable general

        var variable1 = 15;
        var variable2 = 'F';
        var variable3 = 2.8754F;
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);

        //Constantes
        final var PI = 3.14159; //Para declarar constantes como lo puede ser PI o otras cosas
        //PI=3.14159 Este NO funciona
        System.out.println(PI);
    }
}

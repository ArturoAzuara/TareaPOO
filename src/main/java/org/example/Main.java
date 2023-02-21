import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre, profesión y pais de origen: ");
        String entrada = teclado.nextLine();
        String[] separado = entrada.trim().split(" ");
        for (int i = 0; i < 3 ; i++){
            if (i == 0){
                System.out.println("Nombre: " + separado[i].toUpperCase());
            }
            if (i == 1){
                System.out.println("Profesión: " + separado[i].toUpperCase());
            }
            if (i == 2){
                System.out.println("Origen: " + separado[i].toUpperCase());
            }
        }

    }
}
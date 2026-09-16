import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validaciones v = new Validaciones();
        Metodos m = new Metodos();
        Stack<ObjPlato> pila = new Stack<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println();
            System.out.println("Bienvenido a la plateria parcial 2 pilas de Robinson Morales");
            System.out.println("Por favor ingrese la opcion que desea realizar: ");
            System.out.println("1) Apilar un plato");
            System.out.println("2) Retirar un plato");
            System.out.println("3) Consultar el ultimo plato apilado");
            System.out.println("4) Mostrar todos los platos apilados");
            System.out.println("5) Salir");
            int opt = v.ValidarEntero(sc);
            System.out.println();
            switch (opt) {
                case 1:
                    pila = m.ApilarPlato(pila, sc, v);
                    break;
                case 2:
                    pila = m.RetirarPlato(pila);
                    break;
                case 3:
                    m.UltimoPlato(pila);
                    break;
                case 4:
                    m.MostrarPlatos(pila);
                    break;
                case 5:
                    System.out.println("Gracias por usar la plateria parcial 2 pilas de Robinson Morales espero tener un 5 de calificacion :D");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese una opcion del 1 al 5");
                    System.out.println();
                    break;
            }
        }
    }
}

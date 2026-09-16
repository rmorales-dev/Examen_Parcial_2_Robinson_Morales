import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<ObjPlato> ApilarPlato(Stack<ObjPlato> pila, Scanner sc, Validaciones v) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el codigo del plato: ");
            int Codigo = v.ValidarEntero(sc);
            System.out.println("Ingrese el tipo de plato: ");
            String Tipo = v.ValidarString(sc);
            System.out.println("Ingrese el Material del plato: ");
            String Material = v.ValidarString(sc);
            System.out.println("Ingrese el Color del plato: ");
            String Color = v.ValidarString(sc);

            ObjPlato o = new ObjPlato(Codigo, Tipo, Material, Color);
            pila.push(o);
            System.out.println("Ingrese 1) si quiere apilar otro plato. 2) para salir");
            int opt = v.ValidarEntero(sc);
            if (opt == 2) {
                continuar = false;
            }
        }
        return pila;
    }

    public Stack<ObjPlato> RetirarPlato(Stack<ObjPlato> pila) {
        if (!pila.empty()) {
            ObjPlato o = pila.pop();
            System.out.println("Se ha retirado el ultimo plato apilado que tenia el codigo " + o.getCodigo());
        } else {
            System.out.println("No es posible retirar un plato, la pila esta vacia, te invitamos a apilar un plato en la opcion 1");
            System.out.println();
        }
        return pila;
    }

    public void MostrarPlatos(Stack<ObjPlato> pila) {
        if (!pila.empty()) {
        for (ObjPlato o : pila) {
            System.out.println("Tenemos el plato aplilado con el codigo "+o.getCodigo());
        }
    }else{
        System.out.println("No existe platos apilados para mostrar, te invitamos a apilar un plato en la opcion 1");
        System.out.println();
    }
    }

    public void UltimoPlato(Stack<ObjPlato> pila) {
        if (!pila.empty()) {
            ObjPlato o = pila.peek();
            System.out.println("El ultimo plato apilado es: " + o.getCodigo());

        } else {
            System.out.println("Actualmente no hay platos disponibles, la pila esta vacia, te invitamos a apilar un plato en la opcion 1");
            System.out.println();
        }
    }
}

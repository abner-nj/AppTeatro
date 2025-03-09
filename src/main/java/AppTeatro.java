

/**
 *
 * @author Abner
 */
public class AppTeatro {

    public static void main(String[] args) {
        Movimientos movimientos= new Movimientos();
        
        //registrar 
        movimientos.registrar("juan", 5);
        movimientos.registrar("mario", 20);
        movimientos.registrar("andres", 20);
        movimientos.registrar("bruno", 8);
        movimientos.registrar("Cesar", 15);
        
        //mostrar reservaciones
        
        movimientos.mostrar();
        
        //cancelar una reservacion
        movimientos.eliminar(20);
      //  movimientos.eliminar(1);
        
        movimientos.mostrar();
        
        
        //verificar si el asiento se encuentra ocupado
        System.out.println("El asiento 5 se encuentra ocupado: " + movimientos.verificarAsiento(5));
        System.out.println("El asiento 1 se encuentra ocupado: " + movimientos.verificarAsiento(1));
        System.out.println("");
        
        movimientos.mostrar();
        
        
        //econtrando el mejor asiento
        
        movimientos.asignarMAsiento("Kael");
        
        movimientos.mostrar();
        
    }
}    

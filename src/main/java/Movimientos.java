

import java.util.LinkedList;
import java.util.Queue;



/**
 *
 * @author Abner
 */
public class Movimientos {
    private Queue <Reservacion> reservaciones= new LinkedList<>();
    //metodo para verificar si el asiento se encuentra disponible
    public boolean verificarAsiento (int asiento){
        for (Reservacion r : reservaciones) {
            if (r.getNoAsiento()==asiento){
                return true;
            }
        }
        return false;
    }
    //metodo para registrar un asiento
    public void registrar(String nombre, int asiento){
        if (verificarAsiento(asiento)){
            System.out.println("El numero de asiento: " +asiento + " esta ocupado");
            System.out.println("");
        }else{
            reservaciones.add(new Reservacion(nombre, asiento));
            System.out.println("Reservacion registrada exitosamente \nNumero de asiento: "+asiento+"\nnombre: "+nombre);
            System.out.println("");
        }
    }
    //metodo para eliminar un asiento
    public void eliminar (int asiento){
        if (!verificarAsiento(asiento)){
            System.out.println("El no. asiento: " +asiento + " no esta registrado\n");
        }
        Queue<Reservacion>tmp= new LinkedList<>();
        if (reservaciones.isEmpty()){
            System.out.println("No hay reservaciones registradas\n");
        }else{ 
                for (Reservacion r : reservaciones) {
                    if (r.getNoAsiento()==asiento) {
                        System.out.println("La reservacion " +asiento+" ha sido eliminada\n");
                    }else{
                        tmp.add(r);
                    }
                }
            }
            reservaciones=tmp;

    }
    //metodo para mostrar las reservaciones
    public void mostrar(){
        if (reservaciones.isEmpty()) {
            System.out.println("** No hay reservaciones registradas **");
        }else{
            System.out.println("*** Reservaciones ***");
            for (Reservacion r : reservaciones) {
                System.out.println(r);
            }
            System.out.println("");
        }
    }
    
    //se asigna el mejor asiento
    public void asignarMAsiento(String nombre){
        int aux= mejorAsiento();
        registrar(nombre, aux);
    }
    
    //obtenemos el mejor asiento
    private int mejorAsiento(){
        int n= reservaciones.size();
        int [] tmp = new int[n];
        int contador=0;
        for (Reservacion r : reservaciones) {
            tmp[contador]=r.getNoAsiento();
            contador++;
        }
        ordenar(tmp);
        
        contador=1;
        int aux=0;
        //recorrido para obtener el mejor asiento 
        for (int i = 0; i < tmp.length; i++) {
            if ((contador<tmp[i])&&(contador!=tmp[i])){
                return contador;
            }
            contador++;
            aux=tmp[i];
            
        }
        return aux+1;    
    }
    
    //metodo para ordenar los asientos para obtener el mejor asiento
    private void ordenar(int [] tmp){
       for(int i=0; i < tmp.length-1; i++){
               for(int j=0; j < (tmp.length-1-i); j++){ 
                   //validacion y cambio de datos
                    if(tmp[j] > tmp[j+1]){ 
                           int aux=tmp[j];                
                            tmp[j]=tmp[j+1];          
                            tmp[j+1]=aux;
                     }   
               }
          }
    }
}

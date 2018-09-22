package uninorte;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Persona persona1 = new Persona("Annie", "Rodríguez");
           Persona persona2 = new Persona("Edward", "Sabogal");
           Persona persona3 = new Persona("Lisset", "Rojas");
           LinkedList<Persona> listaAuxiliar = new LinkedList<Persona>();
           
           listaAuxiliar.add(persona1);
           listaAuxiliar.add(persona2);
           listaAuxiliar.add(persona3);
           
           Scanner sc = new Scanner(System.in);
           
           for(Persona p : listaAuxiliar){
         	  System.out.println("\n\rDe:");
        	  System.out.println(p.getNombreCompleto()); 
        	  System.out.println("Digite la dirección: ");
        	  p.setDireccion(sc.nextLine());
        	  System.out.println("Digite el teléfono: ");
        	  p.setTelefono(sc.nextLine());
        	  System.out.println("Digite el correo: ");
        	  p.setCorreo(sc.nextLine());
        	  
           }
           sc.close();
           
           for(Persona p : listaAuxiliar){
        	   System.out.println(p.getNombreCompleto()+" | "+p.getDireccion()+" | "+p.getTelefono()+" | "+p.getCorreo());
        	   
           }
	}

}

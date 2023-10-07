import java.io.File;

import java.util.Scanner;

public package Addresbook;

public class Contacto;{
}
public class Agenda;{
}
public class LeerArchivo {

    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(new File("C:\\Users\\jesus\\OneDrive\\Escritorio\\Certificado Java\\Act4\\AddresBook\\src\\Addresbook\\Agendatelefonica.txt"));

 

            while (input.hasNextLine()) {

                String line = input.nextLine();

                System.out.println(line);

            }

            input.close();

 

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

}
private String nombre;
private int telefono;

public Contacto(String nombre, int telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
}

public Contacto(String nombre) {
    this.nombre = nombre;
    this.telefono = 0;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getTelefono() {
    return telefono;
}

public void setTelefono(int telefono) {
    this.telefono = telefono;
}

public boolean equals(Contacto contacto){
    if(nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())){
          return true;
    }
    return false;
}
public class Addresbook {

	 private Contacto contactos[];

	    
	    public Agenda(){
	        contactos = new Contacto[5];
	    }
	    
	    public Agenda(int tamaño){
	        contactos = new Contacto[tamaño];
	    }
	    
	    public void añadirContacto(Contacto contacto){
	        if(comprobarSiExisteContacto(contacto)){
	            System.out.println("Ya existe un contacto con ese nombre , porfavor digite otro nombre");
	        }
	        else if(comprobarSiLaAgendaEstaLlena()){
	            System.out.println("nLa agenda esta llena");
	        }
	        else{
	            boolean registrado = false;
	            for(int i = 0;i < contactos.length && !registrado; i++){
	                 if(contactos[i] == null){
	                     contactos[i] = contacto;
	                     registrado = true;
	                 }
	            }
	            
	            if(registrado == true){
	                System.out.println("El contacto se ha registrado con exito !!");
	            }else{
	                System.out.println("No se ha podido registrar el contacto");
	            }
	        }
	    }
	    
	    public void eliminarContacto(Contacto contacto){
	        boolean eliminado = false;
	        for(int i = 0;i < contactos.length && !eliminado; i++){
	            if(contactos[i] != null && contactos[i].equals(contacto)){
	                 contactos[i] = null;
	                 eliminado = true;
	            }
	        }
	        
	        if(eliminado == true){
	            System.out.println("El contacto se ha eliminado");
	        }else{
	            System.out.println("El contacto no se ha eliminado");
	        }
	    }
}


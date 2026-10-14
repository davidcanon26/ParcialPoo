/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Agenda {
    private Contacto[] contactos;
    private int contador;
    private int tamañoMaximo = 100;

    public Agenda() {
        contactos = new Contacto[tamañoMaximo];
        contador = 0;
    }
    public boolean agregarContacto(String nombre, String telefono) {
    
    for (int i = 0; i < contador; i++) {
        if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
            return false; 
        }
    }

    if (contador < tamañoMaximo) {
        contactos[contador] = new Contacto(nombre, telefono);
        contador++;
        return true;
    }
    
    return false; 
}

    public String buscarTelefono(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                return contactos[i].getTelefono();
            }
        }
        return "Contacto no registrado"; 
    }
}

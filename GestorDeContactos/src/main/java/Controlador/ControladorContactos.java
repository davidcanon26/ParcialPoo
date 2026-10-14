/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import modelo.Agenda;
import vista.VistaContactos;

/**
 *
 * @author Usuario
 */
public class ControladorContactos {
    private Agenda agenda;
    private VistaContactos vista;

    public ControladorContactos(VistaContactos vista) {
        this.agenda = new Agenda();
        this.vista = vista;
    }
    
    public boolean agregarContacto(String nombre, String telefono) {
        return agenda.agregarContacto(nombre, telefono);
    }

    public String buscarTelefono(String nombre) {
        return agenda.buscarTelefono(nombre);
    }
}

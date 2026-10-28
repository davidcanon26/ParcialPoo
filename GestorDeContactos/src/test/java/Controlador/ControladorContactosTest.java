/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author USER
 */
import org.junit.jupiter.api.Test;
import vista.VistaContactos;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorContactosTest {
    
    @Test
    public void testAgregarContactoDesdeControlador(){
        VistaContactos vista = new VistaContactos();
        ControladorContactos controlador = new ControladorContactos(vista);
        
        boolean agregado = controlador.agregarContacto("Sofia", "3104567890");
        assertTrue(agregado, "El controlador debe permitir agregar el contacto a través de la agenda.");
    }
    @Test
    public void testBuscarTelefonoDesdeControlador(){
        VistaContactos vista = new VistaContactos();
        ControladorContactos controlador = new ControladorContactos(vista);
        
        controlador.agregarContacto("Mateo", "3209876541");
        String telefono = controlador.buscarTelefono("Mateo");
        assertEquals("3209876541", telefono, "El controlador debe retornar el teléfono correcto al buscar por nombre.");
    }
}

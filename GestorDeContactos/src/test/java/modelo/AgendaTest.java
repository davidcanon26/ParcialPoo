/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AgendaTest {
    
    @Test
    public void testAgregarContactoExitoso(){
        Agenda agenda = new Agenda();
        
        boolean resultado = agenda.agregarContacto("Carlos", "3001234567");
        assertTrue(resultado, "El contacto debería agregarse correctamente.");
    }
    @Test
    public void testAgregarContactoDuplicadoIgnorandoMayusculas() {
        Agenda agenda = new Agenda();
        
        agenda.agregarContacto("Ana", "3119876543");
        boolean resultadoDuplicado = agenda.agregarContacto("ANA", "3221112233");
        assertFalse(resultadoDuplicado, "No se debería permitir registrar un contacto con el mismo nombre.");
    }
    @Test
    public void testBuscarTelefonoExistente() {
        Agenda agenda = new Agenda();
        
        agenda.agregarContacto("Lucia", "3157894561");
        String telefono = agenda.buscarTelefono("Lucia");
        assertEquals("3157894561", telefono, "El teléfono recuperado debe coincidir.");
    }

    @Test
    public void testBuscarTelefonoNoExistente() {
        Agenda agenda = new Agenda();
        
        String resultado = agenda.buscarTelefono("PedroInexistente");
        assertEquals("Contacto no registrado", resultado, "Debe retornar el mensaje de que el contacto no está registrado.");
    }
}

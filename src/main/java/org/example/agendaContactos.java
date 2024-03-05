package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * metodo addContact que comprueba si el nombre del contacto o el telefono ya existe en la lista.
 * metodo removeContact que elimina contactos ya existentes
 * metodo modifyPhoneNumber para cambiar el numero viejo por el número nuevo
 * @version 1.0
 * @since 2024
 * @author francisco gallego
 */
public class agendaContactos implements iagendaContactos {
    public static List<Persona> contacts; // Lista de Persona

    public agendaContactos() {
        this.contacts = new ArrayList<>();
    }


}
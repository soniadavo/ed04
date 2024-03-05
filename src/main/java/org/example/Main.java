package org.example;

public class Main {
        public static void main(String[] args){
            initAgenda();
            // Crear una nueva agenda.
            org.example.agendaContactos agendaContactos = getAgendaContactos();

            // Imprimir todos los contactos de la agenda.
            System.out.println("Todos los contactos: ");
            for (Persona c : agendaContactos.getContacts()) {
                System.out.println(c.getName() + " -> " + c.getPhones());
            }

        // Añadir un nuevo teléfono a un contacto existente.
        iagendaContactos.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        iagendaContactos.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        iagendaContactos.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Persona c : agendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    private static agendaContactos getAgendaContactos() {
        agendaContactos agendaContactos = new agendaContactos();

        // Añadir contactos a la agenda.
        iagendaContactos.addContact("John Doe", "1234567890");
        iagendaContactos.addContact("Jane Doe", "9876543210");
        iagendaContactos.addContact("Mary Jane", "1122334455");
        return agendaContactos;
    }

    private static void initAgenda() {}

}
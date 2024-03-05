package org.example;
import java.util.Iterator;
import java.util.List;
public interface iagendaContactos {
    /**
     * @param name  agregar contacto
     * @param phone agregar telefono
     *              si existe, agregar nuevo contacto
     */
    static void addContact(String name, String phone) {
        boolean exists = isExists();
        for (Persona c : agendaContactos.contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            agendaContactos.contacts.add(newContact);
        }
    }

    private static boolean isExists() {
        boolean exists = false;
        return exists;
    }

    /**
     * @param name El nombre del contacto que quiere borrar
     */
    static void removeContact(String name) {
        Iterator<Persona> it = agendaContactos.contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * @param name     nombre del contacto
     * @param oldPhone numero de telefono antiguo
     * @param newPhone numero de telefono nuevo
     */
    static void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : agendaContactos.contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    default List<Persona> getContacts() {
        return this.getContacts();
    }
}

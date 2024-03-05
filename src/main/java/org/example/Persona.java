package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase contacto sirve para agregar una nueva informacion a la agenda. Crea contactos a partir de insertar el nombre y el telefono
 */
public class Persona {
    private String name;
    private List<String> phones;

    /**
     * nuevo nombre y telefono
     * @param name
     * @param phone
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * getName
     * @return  devuelve el nombre
     */
    public String getName() {
        return this.name;
    }

    /**
     * getPhones
     * @return devuelve el telefono
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica.dos.clases;

import java.util.List;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Empresa {
    private String ruc;
    private String razonSocial;
    //atributo de relacion de composicion
    private List<Empleado> empleados;

    public Empresa() {
        this.
    }
    

    public Empresa(String ruc, String razonSocial) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public void agregarEmpleado ()
            Empleado empleado = new Empleado(sueldo, cedula, nombre, direccion, correoElectronico)
    
    
}

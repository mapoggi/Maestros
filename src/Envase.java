/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC17
 */
public class Envase {
    private Integer codigo;
    private String nombre;
    private Integer unidad;
    private Integer cantidad;

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Envase(Integer codigo, String nombre, Integer unidad, Integer cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidad = unidad;
        this.cantidad = cantidad;
    }
    
}

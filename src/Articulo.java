/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC17
 */
public class Articulo {
    private Integer codigo;
    private String nombre;
    private String descripcion;
    private Rubro rubro;
    private Subrubro subrubro;

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public Subrubro getSubrubro() {
        return subrubro;
    }
    
}

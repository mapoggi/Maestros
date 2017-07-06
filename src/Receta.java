/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC17
 */
public class Receta {
    private Insumo insumo;
    private String articulo;
    private Integer cantidad;
    private Envase envase;

    public Insumo getInsumo() {
        return insumo;
    }

    public String getArticulo() {
        return articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Envase getEnvase() {
        return envase;
    }

    public Receta(Insumo insumo, String articulo, Integer cantidad, Envase envase) {
        this.insumo = insumo;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.envase = envase;
    }
    
}

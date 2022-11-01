package Productos;

public class Producto {
    private String nombrePrducto;
    private String marca;
    private double precio;

    private int cantidad;

    public Producto(){

    }
    public Producto(String nombrePrducto, String marca, double precio, int cantidad) {
        this.nombrePrducto = nombrePrducto;
        this.marca = marca;
        this.precio = precio;
        this.cantidad =cantidad;
    }
    public Producto(String nombrePrducto, String marca, double precio) {
        this.nombrePrducto = nombrePrducto;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombrePrducto() {
        return nombrePrducto;
    }

    public void setNombrePrducto(String nombrePrducto) {
        this.nombrePrducto = nombrePrducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto:" +
                "nombrePrducto='" + nombrePrducto + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio ;
    }

}

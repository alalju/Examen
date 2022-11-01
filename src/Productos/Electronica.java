package Productos;

public class Electronica extends Producto{
    private String tipoProducto;

    public Electronica(String nombrePrducto, String marca, double precio, String tipoProducto, int cantidad) {
        super(nombrePrducto, marca, precio,cantidad);
        this.tipoProducto = tipoProducto;
    }
    public Electronica(String nombrePrducto, String marca, double precio, String tipoProducto) {
        super(nombrePrducto, marca, precio);
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return super.toString()+ tipoProducto;
    }
}

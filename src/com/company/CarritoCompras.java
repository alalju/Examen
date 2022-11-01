package com.company;

import Productos.Producto;

import java.util.ArrayList;

public class CarritoCompras {
    ArrayList<Producto> producto;
    Tienda tienda;

    public CarritoCompras() {
        this.producto = new ArrayList<>();
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void agregarProducto(Producto p){
        producto.add(p);
    }

    public void mostrarProducto(){
        for(Producto p: getProducto()){
            System.out.println("Producto:"+ p);
        }
    }

    public void eliminarProducto(String nombre){
        for(Producto p: getProducto()){
            if(nombre == p.getNombrePrducto()){
                producto.remove(p);
            }
        }
    }
    public void comprar(){
        double total=0;
        double costrProducto;
        for(Producto p:getProducto()){
            costrProducto=p.getPrecio()* p.getCantidad();
            total=total+costrProducto;
        }
        System.out.println("Compra");
        for(Producto p:getProducto()){
            System.out.println(p);
            System.out.println(p.getCantidad());
        }

        System.out.println("Total= " + total);

    }
    public void buscarProducto(ArrayList<Producto> pts){
        for(Producto p:getProducto()){

        }
    }
/*
    public void agregarproducto(String nombre){
        for(Tienda p: getProducto()){
            if(nombre == p.getNombrePrducto()){
                producto.add(p);
            }
        }
    }

 */


}

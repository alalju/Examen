package com.company;

import Productos.Producto;

import java.util.ArrayList;

public class Tienda {
    ArrayList<Producto> catalogo;
    Usuario usuario;
    CarritoCompras carrito;

    public Tienda(){
        catalogo = new ArrayList<>();
    }

    public void agregarACatalogo(Producto p){
        catalogo.add(p);
    }


    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void mostrarProducto(){
        for(Producto p: getCatalogo()){
            System.out.println("Producto 1:"+ p);
        }

    }

    public void   buscararPro(String nombre){
        Producto encontrado=new Producto();
        for(Producto p: getCatalogo()) {
            if (nombre == p.getNombrePrducto()) {
                System.out.println(p);
            }
        }
    }



}

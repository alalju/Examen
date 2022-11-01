package com.company;

import Productos.Electronica;
import Productos.Farmacia;
import Productos.Producto;

import java.util.Scanner;

public class Main {
    int opc;
    String producto;
    public static void main(String[] args) {
        String op;

        Producto p1 = new Electronica("Refri", "Sony", 10000, "Cocina");
        Producto p2 = new Farmacia("Paracetamol", "duplix", 60, "6 tabletas", "5mlg");

        Producto p3 = new Electronica("Refri", "Sony", 10000, "Cocina",2);
        Producto p4 = new Farmacia("Paracetamol", "duplix", 60, "6 tabletas", "5mlg",3);


        Tienda catalogo = new Tienda();
        CarritoCompras carrito =new CarritoCompras();
        catalogo.agregarACatalogo(p1);
        catalogo.agregarACatalogo(p2);


        carrito.agregarProducto(p3);
        carrito.agregarProducto(p4);

        System.out.println("*****Menú*****");
        System.out.println("***** 1. Ver catalogo *****");
        System.out.println("***** 2. Ver carrito *****");
        System.out.println("***** 3. Agregar producto al carrito *****");
        System.out.println("***** 4. Eliminar producto del carrito *****");
        System.out.println("***** 5. Realizar compra del carrito *****");
        Scanner opc =new Scanner(System.in);
        switch(opc.nextInt()){
            case 1:
                catalogo.mostrarProducto();
                break;
            case 2:
                carrito.mostrarProducto();

                break;
            case 3:
                carrito.agregarProducto(p3);
                carrito.agregarProducto(p4);
                break;
            case 4:
                carrito.eliminarProducto("Refri");
                carrito.mostrarProducto();
                break;
            case 5:
                carrito.comprar();
                break;


        }

    }
}

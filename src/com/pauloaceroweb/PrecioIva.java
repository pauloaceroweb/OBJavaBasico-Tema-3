package com.pauloaceroweb;

public class PrecioIva {

    public static void main(String[] args) {
        double precio = 8325;
        double resultado = getPrecioIva(precio);
        System.out.println("Precio Incluido Iva: COP$ " + resultado);
    }

    static double getPrecioIva(double precio) {
        // Iva en Colombia 20%
        double iva = 1.20;
        return precio * iva;
    }
}

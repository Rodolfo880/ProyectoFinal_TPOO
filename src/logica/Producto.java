/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Producto {
     // Atributos
    private int idProducto;
    private String nomProducto;
    private String marca;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    private int stockMinimo;

     public Producto() {}
    // Constructor con parámetros
     
    public Producto(int idProducto, String nomProducto, String marca,
                    double precioCompra, double precioVenta,
                    int stock, int stockMinimo) {

        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
    }

    //G y S
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
    
      // Métodos
    public void registrar() {
        System.out.println("Producto registrado: " + nomProducto);
    }

    public void actualizar() {
        System.out.println("Producto actualizado: " + nomProducto);
    }

    public void eliminar() {
        System.out.println("Producto eliminado: " + nomProducto);
    }

    public Producto buscar(int id, ArrayList<Producto> lista) {

    for (Producto p : lista) {
        if (p.getIdProducto() == id) {
            return p;
        }
    }
    return null;
}

    public void actualizarStock(int cantidad) {
        this.stock = this.stock + cantidad;
        System.out.println("Stock actualizado: " + stock);
    }
    @Override
    public String toString() {
        return nomProducto + " - " + marca;
    }
}

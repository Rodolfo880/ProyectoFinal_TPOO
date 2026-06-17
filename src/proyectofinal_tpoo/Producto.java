/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

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
        if (nomProducto != null && !nomProducto.isEmpty()) {
            System.out.println("Producto registrado: " + nomProducto);
        } else {
            System.out.println("Error: nombre de producto vacío");
        }
    }

    public void actualizar() {
        if (idProducto > 0) {
            System.out.println("Producto actualizado: " + nomProducto);
        } else {
            System.out.println("Error: producto no válido para actualizar");
        }
    }

    public void eliminar() {
        if (idProducto > 0) {
            System.out.println("Producto eliminado: " + nomProducto);
        } else {
            System.out.println("Error: no se puede eliminar");
        }
    }

    public boolean buscar(String nombreBuscado) {
        if (nomProducto == null) return false;
        return nomProducto.equalsIgnoreCase(nombreBuscado);
    }
    
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
        if (this.stock < 0) {
            this.stock = 0;
        }
        System.out.println("Stock actualizado: " + stock);
    }
}

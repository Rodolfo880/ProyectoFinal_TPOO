/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.ResultSet;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Producto;
/**
 *
 * @author USUARIO
 */
public class ProductoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    //REGISTRAR
    public boolean registrar(Producto p) {

        String sql = "INSERT INTO Producto (idProducto, nomProducto, marca, precioCompra, "
               + "precioVenta, stock, stockMinimo, idCategoria) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        con = cn.getConexion();
        ps = con.prepareStatement(sql);

        ps.setInt(1, p.getIdProducto());
        ps.setString(2, p.getNomProducto());
        ps.setString(3, p.getMarca());
        ps.setDouble(4, p.getPrecioCompra());
        ps.setDouble(5, p.getPrecioVenta());
        ps.setInt(6, p.getStock());
        ps.setInt(7, p.getStockMinimo());
        ps.setInt(8, p.getIdCategoria());

        ps.executeUpdate();
        return true;

    } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    //LISTAR
    public ArrayList<Producto> listar() {

        ArrayList<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM Producto";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();

                p.setIdProducto(rs.getInt("idProducto"));
                p.setNomProducto(rs.getString("nomProducto"));
                p.setMarca(rs.getString("marca"));
                p.setPrecioCompra(rs.getDouble("precioCompra"));
                p.setPrecioVenta(rs.getDouble("precioVenta"));
                p.setStock(rs.getInt("stock"));
                p.setStockMinimo(rs.getInt("stockMinimo"));

                lista.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return lista;
    }

    //BUSCAR
    public Producto buscar(int id) {

        Producto p = null;
        String sql = "SELECT * FROM Producto WHERE idProducto=?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                p = new Producto();

                p.setIdProducto(rs.getInt("idProducto"));
                p.setNomProducto(rs.getString("nomProducto"));
                p.setMarca(rs.getString("marca"));
                p.setPrecioCompra(rs.getDouble("precioCompra"));
                p.setPrecioVenta(rs.getDouble("precioVenta"));
                p.setStock(rs.getInt("stock"));
                p.setStockMinimo(rs.getInt("stockMinimo"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return p;
    }

    //ACTUALIZAR
    public boolean actualizar(Producto p) {

        String sql = "UPDATE Producto SET nomProducto=?, marca=?, precioCompra=?, precioVenta=?, stock=?, stockMinimo=? WHERE idProducto=?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, p.getNomProducto());
            ps.setString(2, p.getMarca());
            ps.setDouble(3, p.getPrecioCompra());
            ps.setDouble(4, p.getPrecioVenta());
            ps.setInt(5, p.getStock());
            ps.setInt(6, p.getStockMinimo());
            ps.setInt(7, p.getIdProducto());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Producto actualizado");
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    //ELIMINAR
    public boolean eliminar(int id) {

        String sql = "DELETE FROM Producto WHERE idProducto=?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Producto eliminado");
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
}

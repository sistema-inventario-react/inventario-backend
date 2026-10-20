package gm.inventarios.service;


import java.util.List;
import gm.inventarios.model.Producto;

public interface IProductoService {
    List<Producto> listarProductos();

    Producto buscarProducto(Integer idProducto);

    void guardarProducto(Producto producto);

    void eliminarProducto(Integer idProducto);
}

package gm.inventarios.service;

import gm.inventarios.model.Producto;
import gm.inventarios.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listarProductos() {
        return this.productoRepository.findAll();
    }

    @Override
    public Producto buscarProducto(Integer idProducto) {
        return this.productoRepository.findById(idProducto).orElse(null);
    }

    @Override
    public void guardarProducto(Producto producto) {
        this.productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Integer idProducto) {
        productoRepository.deleteById(idProducto);
    }
}

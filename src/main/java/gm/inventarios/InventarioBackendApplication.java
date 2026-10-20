package gm.inventarios;

import gm.inventarios.model.Producto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventarioBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventarioBackendApplication.class, args);

        Producto producto = new Producto();

        producto.setDescripcion("Camisa M");
        producto.setPrecio(600.0);
        producto.setExistencia(30);


        // Imprimir el objecto se llama toString lombok

        System.out.println(producto.toString());
    }

}

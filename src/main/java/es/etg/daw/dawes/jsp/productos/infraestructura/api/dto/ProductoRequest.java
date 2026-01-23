package es.etg.daw.dawes.jsp.productos.infraestructura.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoRequest {
    private String nombre;
    private double precio;
    private int categoriaId;
}
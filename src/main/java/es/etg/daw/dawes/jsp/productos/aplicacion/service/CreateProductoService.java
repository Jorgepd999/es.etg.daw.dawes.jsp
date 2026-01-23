package es.etg.daw.dawes.jsp.productos.aplicacion.service;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.jsp.productos.aplicacion.command.CreateProductoCommand;
import es.etg.daw.dawes.jsp.productos.aplicacion.useCase.CreateProductoUseCase;
import es.etg.daw.dawes.jsp.productos.domain.model.Producto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class CreateProductoService {

	private final CreateProductoUseCase createProductoUseCase;

	public Producto createProducto(CreateProductoCommand comando){
		Producto producto = createProductoUseCase.create(comando);
		return producto;
	}  
	
}
package com.automotriz.springboot.backend.apirest.models.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.automotriz.springboot.backend.apirest.models.entity.Producto;
import com.automotriz.springboot.backend.apirest.models.repository.ProductoServiceImpl;

/**
 * Clase Controller
 * 
 */
@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class AutomotrizRestController {
	@Autowired
	private ProductoServiceImpl productoService;

	@GetMapping("/login")
	public Boolean index() {
		return true;
	}
	
	
	/**
	 * Controlador para listar productos.
	 * 
	 * @return
	 * 
	 * 
	 */
	@GetMapping("/productos")
	public List<Producto> listProductos() {

		return productoService.findAll();

	}

	/**
	 * Controlador para buscar productos.
	 * 
	 * @param id parametro tipo Long.
	 * @return
	 * 
	 * 
	 */
	@GetMapping("/productos/{id}")
	public Producto show(@PathVariable Long id) {
		return this.productoService.findById(id);
	}

	/**
	 * Controlador para registrar productos.
	 * 
	 * @param producto parametro de tipo producto.
	 * @return
	 * 
	 */
	@PostMapping("/productos")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
		
		producto.setFechaRegistro(new Date());
		this.productoService.save(producto);
		return producto;
		
	}

	/**
	 * Controlador para actualizar productos.
	 * 
	 * @param producto parametro tipo producto.
	 * @param id       parametro tipo Long.
	 * @return
	 */
	@PutMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		Producto currentProducto = this.productoService.findById(id);
		currentProducto.setNombreProd(producto.getNombreProd());
		currentProducto.setPrecioProd(producto.getPrecioProd());
		currentProducto.setCodigo(producto.getCodigo());
		currentProducto.setUsuarioUpate(producto.getUsuarioUpate());
		this.productoService.save(currentProducto);
		return currentProducto;
	}

	/**
	 * Controlador para eliminar productos
	 * 
	 * @param id parametro tipo Long.
	 * 
	 */
	@DeleteMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Producto currentProducto = this.productoService.findById(id);
		this.productoService.delete(currentProducto);
		
	}

}

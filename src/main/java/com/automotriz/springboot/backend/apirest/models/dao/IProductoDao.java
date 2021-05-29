package com.automotriz.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.automotriz.springboot.backend.apirest.models.entity.Producto;

/**
 * Clase Dao
 
 *
 */
public interface IProductoDao extends CrudRepository<Producto, Long>{

}

package com.unab.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.unab.app.models.Producto;

public interface IProductoDAO extends PagingAndSortingRepository<Producto, Long>{
	
	@Query("select p Producto p where p.nombre like %?1%")
	public Producto findByNombre(String nombre);
	
	public List<Producto> findByNombreLikeIgnoreCase(String nombre);
}

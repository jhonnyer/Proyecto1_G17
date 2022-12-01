package com.unab.app.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.unab.app.models.Producto;

@Repository
public interface IProductoDAO extends PagingAndSortingRepository<Producto, Long> {

	public Producto findByNombre(String nombre);
}

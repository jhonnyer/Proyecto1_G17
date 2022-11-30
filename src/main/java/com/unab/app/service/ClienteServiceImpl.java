package com.unab.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.unab.app.models.Cliente;
import com.unab.app.service.interfaces.IClienteService;

public class ClienteServiceImpl implements IClienteService{

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}

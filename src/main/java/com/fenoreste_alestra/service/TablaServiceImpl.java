package com.fenoreste_alestra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenoreste_alestra.dao.TablaDao;
import com.fenoreste_alestra.entity.Tabla;
import com.fenoreste_alestra.entity.TablaPK;


@Service
public class TablaServiceImpl implements ITablaService{
    
	@Autowired
	private TablaDao tablaDao;
	
	@Override
	public Tabla buscarPorId(TablaPK pk) {
		return tablaDao.findById(pk).orElse(null);
	}

}

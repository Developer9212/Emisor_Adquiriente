package com.fenoreste_alestra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fenoreste_alestra.entity.Tabla;
import com.fenoreste_alestra.entity.TablaPK;

public interface TablaDao extends JpaRepository<Tabla, TablaPK>{

}

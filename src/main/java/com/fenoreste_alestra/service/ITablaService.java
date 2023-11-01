package com.fenoreste_alestra.service;

import com.fenoreste_alestra.entity.Tabla;
import com.fenoreste_alestra.entity.TablaPK;

public interface ITablaService {

	public Tabla buscarPorId(TablaPK pk);
}

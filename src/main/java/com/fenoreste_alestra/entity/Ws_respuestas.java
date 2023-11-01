package com.fenoreste_alestra.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ws_petciones_tdd")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ws_respuestas implements Serializable {

	@Id
	private Timestamp fecha_hora;
	private String jos_peticion;
	private Integer id_tipo_peticion;
	private String json_respuesta_servicio;
	
	private final static long serialVersionUID = 1L;

}

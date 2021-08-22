package com.empresa.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entidad.Disponibilidad;

public interface DisponibilidaRepository extends JpaRepository<Disponibilidad, Integer>{

	public List<Disponibilidad> listaPorCicloHoraInicioAndFin(int idCiclo ,String horaInicio,String horaFin);
	
}

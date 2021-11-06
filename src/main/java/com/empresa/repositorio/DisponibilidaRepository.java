package com.empresa.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entidad.Disponibilidad;

public interface DisponibilidaRepository extends JpaRepository<Disponibilidad, Integer>{

	@Query("Select d from Disponibilidad  d where"
										+ " (:p_ciclo is -1  or  d.ciclo = :p_ciclo) and "
										+ "	(:p_inicio is '' or  d.horaInicio = :p_inicio) and "
										+ " (:p_fin is ''  or  d.horaFin = :p_fin)")
	public List<Disponibilidad> listaPorCicloHoraInicioAndFin(
			@Param("p_ciclo") int idCiclo ,
			@Param("p_inicio")String horaInicio,
			@Param("p_fin")String horaFin);
	
}

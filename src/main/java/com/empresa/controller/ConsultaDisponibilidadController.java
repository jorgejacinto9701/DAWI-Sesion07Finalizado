package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entidad.Ciclo;
import com.empresa.servicio.CicloService;

@Controller
public class ConsultaDisponibilidadController {

	@Autowired
	private CicloService cicloService;
	

	@RequestMapping("/")
	public String ver() {
		return "intranetConsultaDisponibilidad";
	}
	
	@RequestMapping("/cargaCiclo")
	@ResponseBody
	public List<Ciclo> listaCiclo(){
		return cicloService.listaCiclo();
	}
	
	
	
	
}

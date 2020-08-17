package com.mukesh.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import com.mukesh.dto.StudentDTO;
import com.mukesh.service.StudentOperationsService;
import com.mukesh.vo.StudentVO;

/**
 * @author mukesh
 *
 */
@Controller("controller")
public  class MainController {
	@Autowired
	private StudentOperationsService service;
	public  String  handleStudent( StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		//convert VO to DTO
		dto=new StudentDTO();
	
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use service
		result=service.register(dto);
		return result;
		
		
	}
	

}

package com.mukesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;

import com.mukesh.dto.StudentDTO;
import com.mukesh.service.StudentOperationsService;
import com.mukesh.vo.StudentVO;

@Controller("controller")
public  class MainController {
	@Autowired
	private StudentOperationsService service;

	public @Nullable String  handleStudent(@NonNull StudentVO vo)throws Exception{
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

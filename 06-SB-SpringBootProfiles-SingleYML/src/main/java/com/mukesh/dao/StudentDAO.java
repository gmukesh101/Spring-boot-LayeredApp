package com.mukesh.dao;

import org.springframework.lang.NonNull;

import com.mukesh.bo.StudentBO;

/**
 * @author mukesh
 *
 */
public interface StudentDAO {
	
	public   int insert(@NonNull StudentBO bo)throws Exception;

}

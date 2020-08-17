package com.mukesh.service;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.mukesh.dto.StudentDTO;

/**
 * @author mukesh
 *
 */
public interface StudentOperationsService {
   public @Nullable String  register(@NonNull StudentDTO dto)throws Exception;
}

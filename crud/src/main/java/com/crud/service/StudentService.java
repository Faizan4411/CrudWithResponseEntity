package com.crud.service;


import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentDto;

import java.util.List;

public interface StudentService {

   List<StudentDto> findAll();

   StudentDto findById(Long stdId) throws Exception;

   StudentDto create(StudentRequest request);

   StudentDto update(Long stdId, StudentRequest request);

   void delete(Long id);

}

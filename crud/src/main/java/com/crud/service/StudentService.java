package com.crud.service;

<<<<<<< HEAD
import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentResponse;
import com.crud.repository.StudentRepository;
=======

import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentDto;
>>>>>>> 3450800 (Added crud folder with all files)

import java.util.List;

public interface StudentService {

<<<<<<< HEAD
    List<StudentResponse> getAll();

    StudentResponse getById(Long stdId);

    StudentResponse create(StudentRequest request);

    StudentResponse update(Long stdId, StudentRequest request);

    void delete(Long stdId);
=======
   List<StudentDto> findAll();

   StudentDto findById(Long stdId) throws Exception;

   StudentDto create(StudentRequest request);

   StudentDto update(Long stdId, StudentRequest request);

   void delete(Long id);
>>>>>>> 3450800 (Added crud folder with all files)

}

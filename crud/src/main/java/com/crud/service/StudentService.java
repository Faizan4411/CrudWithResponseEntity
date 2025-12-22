package com.crud.service;

import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentResponse;
import com.crud.repository.StudentRepository;

import java.util.List;

public interface StudentService {

    List<StudentResponse> getAll();

    StudentResponse getById(Long stdId);

    StudentResponse create(StudentRequest request);

    StudentResponse update(Long stdId, StudentRequest request);

    void delete(Long stdId);

}

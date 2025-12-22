package com.crud.service.impl;

import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentResponse;
import com.crud.entity.Student;
import com.crud.mapper.StudentMapper;
import com.crud.repository.StudentRepository;
import com.crud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final StudentMapper mapper;


    @Override
    public List<StudentResponse> getAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public StudentResponse getById(Long stdId) {
        Student student = repository.findById(stdId).orElseThrow();
        return mapper.toDto(student);
    }

    @Override
    public StudentResponse create(StudentRequest request) {
        Student student= mapper.toEntity(request);
        return mapper.toDto(repository.save(student));
    }

    @Override
    public StudentResponse update(Long stdId, StudentRequest request) {
        Student student = repository.findById(stdId).orElseThrow();

        student.setStdName(request.getStdName());
        student.setStdRollNo(request.getStdRollNo());

        return mapper.toDto(repository.save(student));
    }

    @Override
    public void delete(Long stdId) {
        repository.deleteById(stdId);
    }
}

package com.crud.service.impl;

<<<<<<< HEAD
import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentResponse;
=======

import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentDto;
>>>>>>> 3450800 (Added crud folder with all files)
import com.crud.entity.Student;
import com.crud.mapper.StudentMapper;
import com.crud.repository.StudentRepository;
import com.crud.service.StudentService;
import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
=======
import org.mapstruct.Mapper;
>>>>>>> 3450800 (Added crud folder with all files)
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

<<<<<<< HEAD
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
=======
    private final StudentRepository stdRepository;
    private final StudentMapper stdMapper;

    @Override
    public List<StudentDto> findAll() {
        return stdMapper.toDtoList(stdRepository.findAll());
    }

    @Override
    public StudentDto findById(Long stdId) {
        StudentDto std=null;
        try{
            std=stdMapper.toDto(stdRepository.getById(stdId));
        }catch(Exception e){e.printStackTrace();}
        return std;
    }

    @Override
    public StudentDto create(StudentRequest request) {
        Student student= stdMapper.toEntity(request);
        return stdMapper.toDto(stdRepository.save(student));
    }

    @Override
    public StudentDto update(Long stdId, StudentRequest request) {
        Student student= stdRepository.findById(stdId).orElseThrow();
>>>>>>> 3450800 (Added crud folder with all files)

        student.setStdName(request.getStdName());
        student.setStdRollNo(request.getStdRollNo());

<<<<<<< HEAD
        return mapper.toDto(repository.save(student));
=======
        return stdMapper.toDto(stdRepository.save(student));
>>>>>>> 3450800 (Added crud folder with all files)
    }

    @Override
    public void delete(Long stdId) {
<<<<<<< HEAD
        repository.deleteById(stdId);
    }
=======
        stdRepository.deleteById(stdId);
        System.out.println("rows is Record deleted : "+stdId);
    }


>>>>>>> 3450800 (Added crud folder with all files)
}

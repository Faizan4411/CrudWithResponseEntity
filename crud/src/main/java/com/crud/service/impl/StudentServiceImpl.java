package com.crud.service.impl;


import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentDto;
import com.crud.entity.Student;
import com.crud.mapper.StudentMapper;
import com.crud.repository.StudentRepository;
import com.crud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

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

        student.setStdName(request.getStdName());
        student.setStdRollNo(request.getStdRollNo());

        return stdMapper.toDto(stdRepository.save(student));
    }

    @Override
    public void delete(Long stdId) {
        stdRepository.deleteById(stdId);
        System.out.println("rows is Record deleted : "+stdId);
    }


}

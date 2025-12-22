package com.crud.mapper;


import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentResponse;
import com.crud.entity.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel ="spring")
public interface StudentMapper {

    Student toEntity(StudentRequest request);

    StudentResponse toDto(Student student);

    List<StudentResponse> toDtoList(List<Student> students);




}

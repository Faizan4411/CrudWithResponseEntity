package com.crud.mapper;


import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentDto;
import com.crud.entity.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(StudentRequest request);

    StudentDto toDto(Student student);

    List<StudentDto> toDtoList(List<Student> student);





}

package com.crud.mapper;


import com.crud.dto.request.StudentRequest;
<<<<<<< HEAD
import com.crud.dto.response.StudentResponse;
=======
import com.crud.dto.response.StudentDto;
>>>>>>> 3450800 (Added crud folder with all files)
import com.crud.entity.Student;
import org.mapstruct.Mapper;

import java.util.List;

<<<<<<< HEAD
@Mapper(componentModel ="spring")
=======
@Mapper(componentModel = "spring")
>>>>>>> 3450800 (Added crud folder with all files)
public interface StudentMapper {

    Student toEntity(StudentRequest request);

<<<<<<< HEAD
    StudentResponse toDto(Student student);

    List<StudentResponse> toDtoList(List<Student> students);
=======
    StudentDto toDto(Student student);

    List<StudentDto> toDtoList(List<Student> student);

>>>>>>> 3450800 (Added crud folder with all files)




}

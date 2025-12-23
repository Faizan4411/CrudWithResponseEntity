package com.crud.controller;

import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentDto;
import com.crud.entity.Student;
import com.crud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> findAll(){
        List list=studentService.findAll();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/{stdId}")
    public ResponseEntity<StudentDto> findById(@PathVariable Long stdId)throws Exception{
        StudentDto std=studentService.findById(stdId);
        if(std==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(std));
    }

    @PostMapping
    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentRequest request){

        StudentDto studentDto = null;
        try {
           studentService.create(request);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{stdId}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long stdId ,@RequestBody StudentRequest request){

        try{
             StudentDto  std=studentService.update(stdId, request);
            return ResponseEntity.ok().body(std);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/{stdId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long stdId){
        try{
            studentService.delete(stdId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch(Exception e){
            e.printStackTrace();
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

}

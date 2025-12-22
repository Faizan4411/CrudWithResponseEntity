package com.crud.controller;

import com.crud.dto.request.StudentRequest;
import com.crud.dto.response.StudentResponse;
import com.crud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;


    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAll(){

        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{stdId}")
    public ResponseEntity<StudentResponse> getById(@PathVariable long stdId){
        return ResponseEntity.ok(service.getById(stdId));
    }

    @PostMapping
    public ResponseEntity<StudentResponse> create(@RequestBody StudentRequest request){
        StudentResponse response= service.create(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

    @PutMapping("/{stdId}")
    public ResponseEntity<StudentResponse> update(@PathVariable Long stdId, @RequestBody StudentRequest request){
        return ResponseEntity.ok(service.update(stdId,request));
    }

    @DeleteMapping("/{stdId}")
    public ResponseEntity<Void> delete(@PathVariable Long stdId){
        service.delete(stdId);
        return ResponseEntity.noContent().build();
    }












}

package com.example.demo.controller;

import com.example.demo.repository.taskRep;
import com.example.demo.service.taskService;
import com.example.demo.taskManagement.task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class taskController {
    @Autowired
    private taskService taskService;
    @PostMapping("/save")
    public String save(@RequestBody task task){
        taskService.savetask(task);
        return "Saved the Task";
    }
    @GetMapping("/get")
    public List<task> getTask(){

        return taskService.getTask();
    }
    @GetMapping("/get/{id}")
    public task getTaskID(@PathVariable int id)
    {
        return taskService.getTaskID(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateTask(@PathVariable int id ,@RequestBody task updateTask){
        boolean isUpdated = taskService.updateTask(id, updateTask);

        if (isUpdated){
            return ResponseEntity.ok("Updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/delet/{id}")
    public ResponseEntity<String> isdeleted(@PathVariable int id){
        boolean deleted = taskService.isdeleted(id);

        if(deleted){
            return ResponseEntity.ok("Deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }







}

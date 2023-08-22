package com.example.demo.service;

import com.example.demo.repository.taskRep;
import com.example.demo.taskManagement.task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class taskServiceImpl  implements taskService{
    @Autowired
    private taskRep taskRep;

    @Override
    public task savetask(task task) {
        return taskRep.save(task);
    }

    @Override
    public List<task> getTask() {
        return taskRep.findAll();
    }

    @Override
    public task getTaskID(int id) {
        return taskRep.findById(id).orElse(null);
    }

    @Override
    public boolean updateTask(int id, task updateTask) {
        Optional<task> existingtask = taskRep.findById(id);

        if (existingtask.isPresent()){
            task tasktoupdate = existingtask.get();
            tasktoupdate.setTitel(updateTask.getTitel());
            tasktoupdate.setDescription(updateTask.getDescription());
            tasktoupdate.setDueDAte(updateTask.getDueDAte());
            tasktoupdate.setCompleted(updateTask.isCompleted());
            tasktoupdate.setDeleted(updateTask.isDeleted());

            taskRep.save(tasktoupdate);
            return true;
        } else {
        return false;
    }}

    @Override
    public boolean isdeleted(int id) {
        Optional<task> taskOptional = taskRep.findById(id) ;

        if (taskOptional.isPresent()){
            task task= taskOptional.get();
            task.setDeleted(true);
            taskRep.save(task);
            return true;
        }else{
        return false;
    }}
}

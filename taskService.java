package com.example.demo.service;

import com.example.demo.taskManagement.task;

import java.util.List;

public interface taskService {
    public task savetask(task task);
    public List<task> getTask();
    public task getTaskID(int id);
    public boolean updateTask(int id , task updateTask);
    public boolean isdeleted(int id);


}

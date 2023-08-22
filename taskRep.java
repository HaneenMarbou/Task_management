package com.example.demo.repository;

import com.example.demo.taskManagement.task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface taskRep extends JpaRepository<task,Integer>{


}

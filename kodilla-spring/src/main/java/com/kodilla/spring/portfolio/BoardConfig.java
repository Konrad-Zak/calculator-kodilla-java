package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    Board initialization(){
        return new Board(toDoTasks(), progressTasks(), endTasks());
    }

    private TaskList toDoTasks(){
        return new TaskList();
    }

    private TaskList progressTasks(){
        return new TaskList();
    }

    private TaskList endTasks(){
        return new TaskList();
    }

}

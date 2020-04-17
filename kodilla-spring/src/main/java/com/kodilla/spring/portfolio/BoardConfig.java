package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board(@Qualifier("toDoTasks") TaskList toDoTasks, @Qualifier("progressTasks") TaskList progressTasks,
                       @Qualifier("endTasks") TaskList endTasks){
        return new Board(toDoTasks, progressTasks, endTasks);
    }

    @Bean(name = "toDoTasks" )
    public TaskList toDoTasks(){
        return new TaskList();
    }

    @Bean(name = "progressTasks")
    public TaskList progressTasks(){
        return new TaskList();
    }

    @Bean(name = "endTasks")
    public TaskList endTasks(){
        return new TaskList();
    }

}

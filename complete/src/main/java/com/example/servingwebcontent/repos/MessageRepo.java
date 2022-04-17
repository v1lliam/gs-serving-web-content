package com.example.servingwebcontent.repos;

import java.util.List;

import com.example.servingwebcontent.domain.Message;

import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
    
    List<Message> findByTag(String tag);

}

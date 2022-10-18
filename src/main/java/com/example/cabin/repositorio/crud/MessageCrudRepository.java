package com.example.cabin.repositorio.crud;

import com.example.cabin.modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}

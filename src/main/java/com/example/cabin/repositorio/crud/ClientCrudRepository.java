package com.example.cabin.repositorio.crud;

import com.example.cabin.modelo.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository <Client, Integer> {
}

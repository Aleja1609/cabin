package com.example.cabin.repositorio.crud;

import com.example.cabin.modelo.Cabin;
import org.springframework.data.repository.CrudRepository;

public interface CabinCrudRepository extends CrudRepository<Cabin, Integer> {
}

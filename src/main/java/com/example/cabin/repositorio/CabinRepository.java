package com.example.cabin.repositorio;

import com.example.cabin.modelo.Cabin;
import com.example.cabin.repositorio.crud.CabinCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CabinRepository {
    @Autowired
    private CabinCrudRepository libraryCrudRepository;

    public List<Cabin> getAll(){
        return (List<Cabin>) libraryCrudRepository.findAll();
    }

    public Optional<Cabin> getCabin(int id){
        return libraryCrudRepository.findById(id);
    }

    public Cabin save(Cabin cabin){
        return libraryCrudRepository.save(cabin);
    }

    public void delete(Cabin cabin){
        libraryCrudRepository.delete(cabin);
    }
}

package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ImageModel;

@Repository
public interface ImageRepository extends JpaRepository<ImageModel, Long> {

//	Optional<ImageModel> findByName(String imageName);
    Optional<ImageModel> findByName(String name);


}

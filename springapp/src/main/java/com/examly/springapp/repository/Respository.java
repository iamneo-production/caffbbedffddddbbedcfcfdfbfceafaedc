package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
interface Respository extends JpaRepository<ModelTask,Integer> {
    
}

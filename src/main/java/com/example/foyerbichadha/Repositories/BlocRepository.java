package com.example.foyerbichadha.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.foyerbichadha.entities.Bloc;
@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}

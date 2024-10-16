package com.example.foyerbichadha.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.foyerbichadha.entities.chambre;
@Repository
public interface ChambreRepository extends JpaRepository<chambre,Long> {

}

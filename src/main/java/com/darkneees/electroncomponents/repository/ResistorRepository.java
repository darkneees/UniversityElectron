package com.darkneees.electroncomponents.repository;

import com.darkneees.electroncomponents.entity.resistor.Resistor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResistorRepository extends JpaRepository<Resistor, Long> {
}

package com.darkneees.electroncomponents.repository;

import com.darkneees.electroncomponents.entity.capacitor.Capacitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapacitorRepository extends JpaRepository<Capacitor, Long> {
}

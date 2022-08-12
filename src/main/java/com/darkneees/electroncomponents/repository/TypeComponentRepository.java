package com.darkneees.electroncomponents.repository;

import com.darkneees.electroncomponents.entity.TypeComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeComponentRepository extends JpaRepository<TypeComponent, Long> {}

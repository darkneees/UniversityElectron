package com.darkneees.electroncomponents.repository;

import com.darkneees.electroncomponents.entity.Components;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentsRepository extends JpaRepository<Components, Long> {
}

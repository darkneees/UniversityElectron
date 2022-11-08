package com.darkneees.electroncomponents.repository.components;

import com.darkneees.electroncomponents.entity.components.ComponentAbstract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository <E extends ComponentAbstract> extends JpaRepository<E, Long> {
}

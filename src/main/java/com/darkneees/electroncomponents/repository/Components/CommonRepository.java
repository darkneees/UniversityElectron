package com.darkneees.electroncomponents.repository.Components;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository <E extends ComponentAbstract> extends JpaRepository<E, Long> {
}

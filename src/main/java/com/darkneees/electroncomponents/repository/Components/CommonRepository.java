package com.darkneees.electroncomponents.repository.Components;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository <E extends ComponentAbstract> extends CrudRepository<E, Long> {
}

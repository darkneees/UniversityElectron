package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.components.Capacitor;
import com.darkneees.electroncomponents.repository.components.CapacitorRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CapacitorService extends AbstractService<Capacitor, CapacitorRepository> {

    protected CapacitorService(CapacitorRepository repository) {
        super(repository);
    }
}

package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.components.Transistor;
import com.darkneees.electroncomponents.repository.components.TransistorRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class TransistorService extends AbstractService<Transistor, TransistorRepository> {

    protected TransistorService(TransistorRepository repository) {
        super(repository);
    }
}

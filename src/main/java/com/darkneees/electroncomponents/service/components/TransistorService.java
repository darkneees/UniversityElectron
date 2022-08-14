package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.Components.Transistor;
import com.darkneees.electroncomponents.repository.Components.TransistorRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class TransistorService extends AbstractService<Transistor, TransistorRepository> {

    protected TransistorService(TransistorRepository repository) {
        super(repository);
    }
}

package com.darkneees.electroncomponents.service.components;


import com.darkneees.electroncomponents.entity.Components.Resistor;
import com.darkneees.electroncomponents.repository.Components.ResistorRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ResistorService extends AbstractService<Resistor, ResistorRepository> {

    public ResistorService(ResistorRepository repository) {
        super(repository);
    }

}

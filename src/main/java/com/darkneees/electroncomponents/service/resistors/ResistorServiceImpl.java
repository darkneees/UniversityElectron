package com.darkneees.electroncomponents.service.resistors;

import com.darkneees.electroncomponents.entity.resistor.Resistor;
import com.darkneees.electroncomponents.repository.ResistorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResistorServiceImpl implements ResistorsService {

    private final ResistorRepository repository;

    public ResistorServiceImpl(ResistorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Resistor> getAllResistors() {
        return repository.findAll();
    }
}

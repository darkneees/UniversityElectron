package com.darkneees.electroncomponents.service.capacitors;

import com.darkneees.electroncomponents.entity.capacitor.Capacitor;
import com.darkneees.electroncomponents.repository.CapacitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapacitorServiceImpl implements CapacitorService {

    private final CapacitorRepository repository;

    public CapacitorServiceImpl(CapacitorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Capacitor> getAllCapacitors() {
        return repository.findAll();
    }
}

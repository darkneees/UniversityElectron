package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.components.Diode;
import com.darkneees.electroncomponents.repository.components.DiodeRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class DiodeService extends AbstractService<Diode, DiodeRepository> {
    protected DiodeService(DiodeRepository repository) {
        super(repository);
    }
}

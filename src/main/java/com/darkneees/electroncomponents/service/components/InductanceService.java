package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.Components.Inductance;
import com.darkneees.electroncomponents.repository.Components.InductanceRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class InductanceService extends AbstractService<Inductance, InductanceRepository> {

    protected InductanceService(InductanceRepository repository) {
        super(repository);
    }
}

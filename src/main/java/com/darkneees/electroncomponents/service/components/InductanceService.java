package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.components.Inductance;
import com.darkneees.electroncomponents.repository.components.InductanceRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class InductanceService extends AbstractService<Inductance, InductanceRepository> {

    protected InductanceService(InductanceRepository repository) {
        super(repository);
    }
}

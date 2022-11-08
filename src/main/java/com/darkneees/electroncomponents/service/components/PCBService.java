package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.components.PCB;
import com.darkneees.electroncomponents.repository.components.PCBRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class PCBService extends AbstractService<PCB, PCBRepository> {

    protected PCBService(PCBRepository repository) {
        super(repository);
    }
}

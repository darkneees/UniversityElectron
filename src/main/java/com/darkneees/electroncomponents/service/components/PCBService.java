package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.Components.PCB;
import com.darkneees.electroncomponents.repository.Components.PCBRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class PCBService extends AbstractService<PCB, PCBRepository> {

    protected PCBService(PCBRepository repository) {
        super(repository);
    }
}

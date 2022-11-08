package com.darkneees.electroncomponents.service.components;

import com.darkneees.electroncomponents.entity.components.Other;
import com.darkneees.electroncomponents.repository.components.OtherRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class OtherService extends AbstractService<Other, OtherRepository> {

    protected OtherService(OtherRepository repository) {
        super(repository);
    }
}

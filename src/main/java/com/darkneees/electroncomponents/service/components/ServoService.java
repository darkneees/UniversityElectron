package com.darkneees.electroncomponents.service.components;


import com.darkneees.electroncomponents.entity.components.Servo;
import com.darkneees.electroncomponents.repository.components.ServoRepository;
import com.darkneees.electroncomponents.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ServoService extends AbstractService<Servo, ServoRepository> {

    public ServoService(ServoRepository repository) {
        super(repository);
    }

}

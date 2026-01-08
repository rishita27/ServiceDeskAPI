package com.rkotiyal.servicedesk.service;

import com.rkotiyal.servicedesk.model.ServiceEntity;
import com.rkotiyal.servicedesk.repository.ServiceRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class ServiceService {

    private final ServiceRepository repository;

    public ServiceService(ServiceRepository repository){
        this.repository = repository;
    }

    @Cacheable("services")
    public List<ServiceEntity> getAllServices() {
        return repository.findAll();
    }
}

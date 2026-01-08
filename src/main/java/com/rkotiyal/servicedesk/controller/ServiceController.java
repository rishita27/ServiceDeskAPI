package com.rkotiyal.servicedesk.controller;

import com.rkotiyal.servicedesk.model.ServiceEntity;
import com.rkotiyal.servicedesk.repository.ServiceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {

    private final ServiceRepository repository;

    public ServiceController(ServiceRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<ServiceEntity> getAllService() {
        return repository.findAll();
    }

    @PostMapping
    public ServiceEntity createService(@RequestBody ServiceEntity service){
        return repository.save(service);
    }

}

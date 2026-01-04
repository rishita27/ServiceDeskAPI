package com.rkotiyal.servicedesk.repository;

import com.rkotiyal.servicedesk.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}

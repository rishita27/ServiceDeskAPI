package com.rkotiyal.servicedesk.repository;

import com.rkotiyal.servicedesk.model.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
}

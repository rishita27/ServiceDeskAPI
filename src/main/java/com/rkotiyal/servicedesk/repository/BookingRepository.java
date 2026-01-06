package com.rkotiyal.servicedesk.repository;

import com.rkotiyal.servicedesk.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}

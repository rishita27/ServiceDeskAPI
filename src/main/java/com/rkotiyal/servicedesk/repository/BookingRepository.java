package com.rkotiyal.servicedesk.repository;

import com.rkotiyal.servicedesk.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    
    boolean existsByServiceIdAndBookingTimeAndCanceledFalse(Long id, LocalDateTime bookingTime);
}

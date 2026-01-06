package com.rkotiyal.servicedesk.service;

import com.rkotiyal.servicedesk.model.Booking;
import com.rkotiyal.servicedesk.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }

    public Booking createBooking(Booking booking) {
        boolean exists = bookingRepository
                .existsByServiceIdAndBookingTimeAndCanceledFalse(
                        booking.getService().getId(),
                        booking.getBookingTime()
                );
        if(exists){
            throw new RuntimeException("Service already booked for this time");
        }

        return bookingRepository.save(booking);
    }

    public Booking cancelBooking(Long id) {
        Booking booking = bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        booking.setCanceled(true);
        return bookingRepository.save(booking);
    }
}

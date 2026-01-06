package com.rkotiyal.servicedesk.controller;

import com.rkotiyal.servicedesk.model.Booking;
import com.rkotiyal.servicedesk.repository.BookingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingRepository repository;

    public BookingController(BookingRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Booking> getAllBookings(){
        return repository.findAll();
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking){
        return repository.save(booking);
    }

    @PatchMapping("/{id}/cancel")
    public Booking cancelBooking(@PathVariable Long id) {
        Booking booking = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        booking.setCanceled(true);
        return repository.save(booking);
    }
}

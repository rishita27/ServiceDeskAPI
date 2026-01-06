package com.rkotiyal.servicedesk.controller;

import com.rkotiyal.servicedesk.model.Booking;
import com.rkotiyal.servicedesk.repository.BookingRepository;
import com.rkotiyal.servicedesk.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking){
        return bookingService.createBooking(booking);
    }

    @PatchMapping("/{id}/cancel")
    public Booking cancelBooking(@PathVariable Long id) {
        return bookingService.cancelBooking(id);
    }
}

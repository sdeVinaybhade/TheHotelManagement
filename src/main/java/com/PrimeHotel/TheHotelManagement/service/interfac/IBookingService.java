package com.PrimeHotel.TheHotelManagement.service.interfac;

import com.PrimeHotel.TheHotelManagement.dto.Response;
import com.PrimeHotel.TheHotelManagement.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}

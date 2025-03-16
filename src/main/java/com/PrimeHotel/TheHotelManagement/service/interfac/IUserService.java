package com.PrimeHotel.TheHotelManagement.service.interfac;

import com.PrimeHotel.TheHotelManagement.dto.LoginRequest;
import com.PrimeHotel.TheHotelManagement.dto.Response;
import com.PrimeHotel.TheHotelManagement.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}

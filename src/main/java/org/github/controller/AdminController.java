package org.github.controller;

import org.github.dao.UserDao;
import org.github.entity.User;
import org.github.service.HotelService;
import org.github.service.ReservationService;
import org.github.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminController {
    private final UserService userService;
    private final HotelService hotelService;
    private final ReservationService reservationService;

    @Autowired
    public AdminController(UserService userService, HotelService hotelService, ReservationService reservationService) {
        this.userService = userService;
        this.hotelService = hotelService;
        this.reservationService = reservationService;
    }

    @RequestMapping(value = "/show-all-users", method = RequestMethod.POST)
    public String getAllUsers(@RequestParam(name = "filter", required = false) String filterMode) {

        List<User> users = userService.findAllUsers();



        return "redirect:/admin-page" + (filterMode != null && !filterMode.isBlank() ? "?filter=" + filterMode : "");
    }
}

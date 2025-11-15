package org.github.service;

import org.github.dao.HotelDao;
import org.github.entity.Address;
import org.github.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HotelService {
    private final HotelDao hotelDao;

    @Autowired
    public HotelService(HotelDao hotelDao) {
        this.hotelDao = hotelDao;
    }

    public List<Hotel> getAllHotels() {
        List<Hotel> hotels = hotelDao.getAllHotels();
        return hotels;
    }

    public void createHotel(Hotel hotel) {
        if(hotel.getName() != null || !hotel.getName().isEmpty()) {
            hotelDao.saveHotel(hotel);
        }
    }

    public void changeHotelName(int id, String newName) {
        if(newName != null && !newName.isEmpty()) {
            hotelDao.updateHotelName(id, newName);
        }
    }

    public void changeHotelRating(int id, int rating) {
        if(rating <= 5 && rating >= 1) {
            hotelDao.updateHotelRating(id, rating);
        }
    }

    public void changeHotelPrice(int id, int price) {
        if(price > 0) {
            hotelDao.updateHotelPrice(id, price);
        }
    }

    public void changeHotelAddress(int id, Address address) {
        if(address != null) {
            hotelDao.updateHotelAddress(id, address);
        }
    }

    public void deleteHotel(int id) {
        hotelDao.deleteHotel(id);
    }
}

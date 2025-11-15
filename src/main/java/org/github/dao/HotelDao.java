package org.github.dao;

import org.github.entity.Address;
import org.github.entity.Hotel;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class HotelDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Hotel> getAllHotels() {
        Query query = entityManager.createQuery("SELECT h FROM Hotel h");
        List<Hotel> hotels = query.getResultList();
        return hotels;
    }

    public void saveHotel(Hotel hotel) {
        entityManager.persist(hotel);
    }

    public void updateHotelName(int id, String name) {
        Query query = entityManager.createQuery("UPDATE Hotel h SET h.name = :name WHERE h.id = :id");
        query.setParameter("name", name);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateHotelRating(int id, int rating) {
        Query query = entityManager.createQuery("UPDATE Hotel h SET h.rating = :rating WHERE h.id = :id");
        query.setParameter("rating", rating);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateHotelPrice(int id, int price) {
        Query query = entityManager.createQuery("UPDATE Hotel h SET h.price = :price WHERE h.id = :id");
        query.setParameter("price", price);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateHotelAddress(int id, Address address) {
        Query query = entityManager.createQuery("UPDATE Hotel h SET h.address = :address WHERE h.id = :id");
        query.setParameter("address", address);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void deleteHotel(int id) {
        Query query = entityManager.createQuery("DELETE FROM Hotel h WHERE h.id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}

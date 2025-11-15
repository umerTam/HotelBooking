package org.github.dao;

import org.github.entity.Reservation;
import org.github.entity.ReservationStatus;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.time.LocalDate;
import java.util.List;

@Repository
public class ReservationDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Reservation> getAllReservations() {
        Query query = entityManager.createQuery("SELECT r FROM Reservation r");
        List<Reservation> reservations = query.getResultList();
        return reservations;
    }

    public void saveReservation(Reservation reservation) {
        entityManager.persist(reservation);
    }

    public void updateReservationDataBegin(int id,@DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dateBegin) {
        Query query = entityManager.createQuery("UPDATE Reservation r SET r.dateBegin = :dateBegin WHERE r.id = :id");
        query.setParameter("dateBegin", dateBegin);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateReservationDataEnd(int id,@DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dateEnd) {
        Query query = entityManager.createQuery("UPDATE Reservation r SET r.dateEnd = :dateEnd WHERE r.id = :id");
        query.setParameter("dateEnd", dateEnd);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateReservationFullPrice(int id, int fullPrice) {
        Query query = entityManager.createQuery("UPDATE Reservation r SET r.fullPrice = :fullPrice WHERE r.id = :id");
        query.setParameter("fullPrice", fullPrice);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateReservationStatus(int id, ReservationStatus reservationStatus) {
        Query query = entityManager.createQuery("UPDATE Reservation r SET r.reservationStatus = :reservationStatus WHERE r.id = :id");
        query.setParameter("reservationStatus", reservationStatus);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void deleteReservation(int id) {
        Query query = entityManager.createQuery("DELETE FROM Reservation r WHERE r.id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}

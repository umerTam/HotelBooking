package org.github.service;

import org.github.dao.ReservationDao;
import org.github.entity.Reservation;
import org.github.entity.ReservationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class ReservationService {

    private final ReservationDao reservationDao;

    @Autowired
    public ReservationService(ReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }

    public List<Reservation> getAllReservations() {
        List<Reservation> reservations = reservationDao.getAllReservations();
        return reservations;
    }

    public void createReservation(Reservation reservation) {
        if(reservation !=null) {
            reservationDao.saveReservation(reservation);
        }
    }

    public void changeReservationDataBegin(int id,@DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dateBegin) {
        if(dateBegin!=null) {
            reservationDao.updateReservationDataBegin(id, dateBegin);
        }
    }

    public void changeReservationDataEnd(int id,@DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dateEnd) {
        if(dateEnd!=null) {
            reservationDao.updateReservationDataEnd(id, dateEnd);
        }
    }

    public void changeReservationFullPrice(int id, int fullPrice) {
        if(fullPrice > 0) {
            reservationDao.updateReservationFullPrice(id, fullPrice);
        }
    }

    public void changeReservationStatus(int id, ReservationStatus reservationStatus) {
        if(reservationStatus != null) {
            reservationDao.updateReservationStatus(id, reservationStatus);
        }
    }

    public void deleteReservation(int id) {
        reservationDao.deleteReservation(id);
    }
}

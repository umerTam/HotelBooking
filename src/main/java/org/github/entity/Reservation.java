package org.github.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "data_begin", nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateBegin;

    @Column(name = "data_end", nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateEnd;

    @Column(name = "full_price", nullable = false)
    private int fullPrice;

    @Column(name = "reservation_status", nullable = false)
    private ReservationStatus reservationStatus;

    @OneToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Reservation() {
    }

    public Reservation(LocalDate dateBegin, LocalDate dateEnd, int fullPrice, ReservationStatus reservationStatus, Hotel hotel, User user) {
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.fullPrice = fullPrice;
        this.reservationStatus = reservationStatus;
        this.hotel = hotel;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

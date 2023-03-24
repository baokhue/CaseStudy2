package services;

import models.Booking;

public interface IBookingService extends IService{
    Booking[] findAll();

    void addNew(Booking booking);

    @Override
    void returnMainMenu();
}

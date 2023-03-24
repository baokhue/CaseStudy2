package services;

import models.Customer;

public interface ICustomerService extends IService{
    void findAll();

    void addNew(Customer customer);

    void updateInformation();

    @Override
    void returnMainMenu();
}

package services;

import models.Employee;

public interface IEmployeeService extends IService{
    void findAll();

    void addNew(Employee employee);

    void update();

    @Override
    void returnMainMenu();
}

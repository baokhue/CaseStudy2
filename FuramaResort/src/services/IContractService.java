package services;

import models.Contract;

public interface IContractService extends IService{
    Contract[] findAll();

    void addNew(Contract contract);

    void update();

    @Override
    void returnMainMenu();
}

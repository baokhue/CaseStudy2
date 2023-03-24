package services;

import models.Facility;

public interface IFacilityService extends IService{
   void findAll();

   void addNew();

   void displayMaintenance();

   @Override
   void returnMainMenu();
}

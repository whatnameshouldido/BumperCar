package com.studymavernspringboot.bumpercar.models;

import java.util.List;

public interface VehicleService {
    public Vehicle addVehicle();
    public boolean removeVehicle();
    public Vehicle updateVehicle();
    public Vehicle findVehicleById();
    public List<Vehicle> getAllVehicle();
    public List<Vehicle> findVehicleForStatus();

}

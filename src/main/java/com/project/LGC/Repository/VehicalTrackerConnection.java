package com.project.LGC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LGC.Model.VehicleTracker;

public interface VehicalTrackerConnection extends JpaRepository<VehicleTracker, Integer> {

}

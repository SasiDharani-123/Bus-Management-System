package com.busmanagement.bus.repository;

import com.busmanagement.bus.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}

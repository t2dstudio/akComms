package com.skillstorm.akcomms.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.akcomms.model.Device;


@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

}
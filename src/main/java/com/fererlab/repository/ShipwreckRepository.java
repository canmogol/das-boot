package com.fererlab.repository;

import com.fererlab.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}

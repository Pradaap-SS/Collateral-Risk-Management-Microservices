package com.cognizant.collaterals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.collaterals.model.Collateral;

/**
 * Repository for adding, fetching and manipulating Collateraal
 */
@Repository
public interface CollateralRepository extends CrudRepository<Collateral, Integer> {

}

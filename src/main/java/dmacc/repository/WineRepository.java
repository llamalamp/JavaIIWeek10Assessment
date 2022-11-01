package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.WineBottle;



/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
@Repository
public interface WineRepository extends JpaRepository<WineBottle, Long> {

}

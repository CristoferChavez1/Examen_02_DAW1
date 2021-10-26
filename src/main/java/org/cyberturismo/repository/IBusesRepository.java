package org.cyberturismo.repository;

import org.cyberturismo.model.Buses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBusesRepository extends JpaRepository<Buses, String> {
	
	//crud...

}

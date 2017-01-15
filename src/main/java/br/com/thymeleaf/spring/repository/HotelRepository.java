package br.com.thymeleaf.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thymeleaf.spring.model.Guest;

public interface HotelRepository extends JpaRepository<Guest, Long> {
	
	List<Guest> findGuestsBySurname(String surname);
	
}

package com.andresonsouza.helpdesk.api.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.andresonsouza.helpdesk.api.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc(String title, String status,
			String priority, Pageable pages);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDesc(String title,
			String status, String priority, Pageable pages);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssingedUserIdOrderByDateDesc(String title,
			String status, String priority, Pageable pages);

	Page<Ticket> findByNumber(Integer number, Pageable pages);

}

package com.andresonsouza.helpdesk.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andresonsouza.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends JpaRepository<ChangeStatus, Long> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId );
}

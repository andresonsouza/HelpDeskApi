package com.andresonsouza.helpdesk.api.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.andresonsouza.helpdesk.api.entity.ChangeStatus;
import com.andresonsouza.helpdesk.api.entity.Ticket;

@Component
public class TicketService {

	Ticket createOrUpdate(Ticket ticket) {
		return null;
	}

	Ticket findById(String id) {
		return null;
	}

	void delete(String id) {
	}

	Page<Ticket> listTicket(int page, int count) {
		return null;
	}

	ChangeStatus createChangeStatus(ChangeStatus changeStatus) {
		return changeStatus;
	}

	Iterable<ChangeStatus> listChangeStatus(String ticketId) {
		return null;
	}

	Page<Ticket> findCurrentUser(int page, int count, String userId) {
		return null;
	}

	Page<Ticket> findByParameters(int page, int count, String title, String status, String priority) {
		return null;
	}

	Page<Ticket> findByParametersAndCurrentUser(int page, int count, String title, String status, String priority,
			String userId) {
		return null;
	}

	Page<Ticket> findByName(int page, int count, Integer number) {
		return null;
	}

	Iterable<Ticket> findAll() {
		return null;
	}

	Page<Ticket> findParameterAndAssignedUser(int page, int count, String title, String status, String priority, String assignedUser) {
		return null;
	}
}

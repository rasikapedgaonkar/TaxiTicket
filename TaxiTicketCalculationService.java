package com.taxi.ticket.service;

import com.taxi.ticket.model.Routes;
import com.taxi.ticket.model.TaxiTicket;

public interface TaxiTicketCalculationService {

	public TaxiTicket calculateFare(Routes routes, int travellers);

	public String displayFare(TaxiTicket taxiTicket);

}

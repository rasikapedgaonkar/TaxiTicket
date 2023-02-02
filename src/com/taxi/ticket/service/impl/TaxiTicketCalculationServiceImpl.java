package com.taxi.ticket.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.taxi.ticket.model.Routes;
import com.taxi.ticket.model.TaxiTicket;
import com.taxi.ticket.service.TaxiTicketCalculationService;

public class TaxiTicketCalculationServiceImpl implements TaxiTicketCalculationService {

	@Override
	public TaxiTicket calculateFare(Routes routes, int travellers) {
		/*
		 * TODO: Calculate fare 1st 100 km = 750 INR. Then 5 INR per km
		 */

		int fare;
		float totalAmout;

		if (routes.getDistance() <= 100)
			fare = 750;
		else
			fare = 750 + ((routes.getDistance() - 100) * 5);

		totalAmout = fare * travellers;

		return new TaxiTicket(routes.getFrom(), routes.getTo(), routes.getDistance(), travellers, totalAmout);

	}

	@Override
	public String displayFare(TaxiTicket taxiTicket) {
		// TODO: Print fare details
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(taxiTicket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

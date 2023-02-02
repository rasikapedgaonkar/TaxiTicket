package com.taxi.ticket;

import com.taxi.ticket.model.Routes;
import com.taxi.ticket.model.TaxiTicket;
import com.taxi.ticket.service.RoutesService;
import com.taxi.ticket.service.TaxiTicketCalculationService;
import com.taxi.ticket.service.impl.RoutesServiceImpl;
import com.taxi.ticket.service.impl.TaxiTicketCalculationServiceImpl;


public class FirstClass {

	public static void main(String args[]) {
		System.out.println("Hello Java");

		// create new route
		Routes createRoute = new Routes("PUNE", "NASIK", 200);
		RoutesService routesService = new RoutesServiceImpl();

		// check if route exist
		Routes existingRoute = routesService.getRoutes(createRoute);
		Routes addedRoute = null;
		if (existingRoute == null) {
			routesService.addRoutes(createRoute);
			addedRoute = routesService.getRoutes(createRoute);
			System.out.println(addedRoute.toString());
		} else
			System.out.println("Route already exist");

		// calculate fare
		TaxiTicketCalculationService calculationService = new TaxiTicketCalculationServiceImpl();
		TaxiTicket taxiTicketData = calculationService.calculateFare(addedRoute, 2);

		// print fare
		System.out.println("Ticket details: "+calculationService.displayFare(taxiTicketData));

	}
}

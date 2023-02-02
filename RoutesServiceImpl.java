package com.taxi.ticket.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.taxi.ticket.model.Routes;
import com.taxi.ticket.service.RoutesService;

public class RoutesServiceImpl implements RoutesService {

	List<Routes> routeList = new ArrayList<>();

	@Override
	public void addRoutes(Routes routes) {
		// TODO: create new route if does not exist
		routeList.add(routes);
	}

	@Override
	public Routes getRoutes(Routes routes) {
		// TODO: check criteria and return route details
		List<Routes> filteredList = routeList.stream()
				.filter(routeList -> (routes.getFrom().equalsIgnoreCase(routeList.getFrom())
						&& routes.getTo().equalsIgnoreCase(routeList.getTo()))
						|| (routes.getFrom().equalsIgnoreCase(routeList.getTo())
								&& routes.getTo().equalsIgnoreCase(routeList.getFrom())))
				.collect(Collectors.toList());
		if (!filteredList.isEmpty())
			return filteredList.get(0);
		return null;
	}

}

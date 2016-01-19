package com.sample.app.ui;

import javax.servlet.annotation.WebServlet;

import com.sample.app.ui.model.RegistrationForm;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("registrationUI")
@Title(value="Registration")

public class RegistrationUI extends UI {

	@WebServlet(urlPatterns = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = RegistrationUI.class)
	public static class Servlet extends VaadinServlet {
	}

	Navigator navigator = new Navigator(this,this);
	
	@Override
	protected void init(VaadinRequest request) {
		setContent(new RegistrationForm(navigator));
	}

}
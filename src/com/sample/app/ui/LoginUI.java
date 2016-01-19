package com.sample.app.ui;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Title("Login")
@Theme("valo")
public class LoginUI extends UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout verticalLayout = new VerticalLayout();

		Label username = new Label("Please enter  username");
		Label password = new Label("Please enter  password");

		TextField usernameTextBox = new TextField();
		TextField passwordTextBox = new TextField();

		Button submit = new Button("Login",new ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				//System.out.println("Button clicked : "+event.getComponent());
				
				
				showNotification("Button has been clicked!!!!!!!!!!!");
				
			}
		});
		verticalLayout.addComponent(username);
		verticalLayout.addComponent(usernameTextBox);
		verticalLayout.addComponent(password);
		verticalLayout.addComponent(passwordTextBox);
		verticalLayout.addComponent(submit);

		verticalLayout.setSizeFull();

		setContent(verticalLayout);

	}

	@WebServlet(value = "/login", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = LoginUI.class)
	public static class Servlet extends VaadinServlet {
	}

}

package com.sample.app.ui.model;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class RegistrationForm extends VerticalLayout implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Navigator navigator ;
	
	Label firstName = new Label("First Name");
	Label lastName = new Label("Last Name");
	Label email = new Label("Email");
	Label mobile = new Label("Mobile");

	Label username = new Label("User Name");
	Label password = new Label("Password");

	TextField firstNameTB = new TextField();
	TextField lastNameTB = new TextField();
	TextField emailTB = new TextField();
	TextField mobileTB = new TextField();
	TextField usernameTB = new TextField();
	TextField passwordTB = new TextField();
	
	Button save = new Button("Save",new Button.ClickListener() {
		
		@Override
		public void buttonClick(ClickEvent event) {
			
			//navigator.addView(viewName, viewClass);
		}
	});

	public RegistrationForm(Navigator navigator) {
		addComponent(firstName);
		addComponent(firstNameTB);
		addComponent(lastName);
		addComponent(lastNameTB);
		addComponent(email);
		addComponent(emailTB);
		addComponent(mobile);
		addComponent(mobileTB);
		addComponent(username);
		addComponent(usernameTB);
		addComponent(password);
		addComponent(passwordTB);
		addComponent(save);
		this.navigator = navigator;
	}
	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("You have completed registratin successfully..");
		
	}

}

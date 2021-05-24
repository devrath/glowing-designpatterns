package com.demo;

import com.demo.customerService.AddCustomerCommand;
import com.demo.customerService.CustomerService;
import com.demo.fx.Button;

public class Main {

    public static void main(String[] args) {
	    var customerService = new CustomerService();
	    var command = new AddCustomerCommand(customerService);
	    var button = new Button(command);
        button.click();
    }
}

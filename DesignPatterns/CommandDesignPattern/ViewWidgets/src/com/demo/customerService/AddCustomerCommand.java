package com.demo.customerService;

import com.demo.fx.Command;

public class AddCustomerCommand implements Command {

    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        // We delegated the work to service from command due to button click
        customerService.addCustomer();
    }
}

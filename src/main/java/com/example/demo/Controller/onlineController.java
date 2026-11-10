package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
public class onlineController {
    @PostMapping("/order")
    @ResponseBody
    public String placeOrder(
            @RequestParam String item,
            @RequestParam int quantity,
            @RequestParam String name,
            @RequestParam String address) {
        return String.format(
            "Order received!%nItem: %s%nQuantity: %d%nName: %s%nAddress: %s",
            item, quantity, name, address);
    }
}

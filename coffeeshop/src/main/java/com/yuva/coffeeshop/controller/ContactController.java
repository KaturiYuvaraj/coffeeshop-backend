package com.yuva.coffeeshop.controller;

import org.springframework.web.bind.annotation.*;
import com.yuva.coffeeshop.entity.ContactMessage;
import com.yuva.coffeeshop.service.ContactService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ContactMessage saveMessage(@RequestBody ContactMessage message) {
        return contactService.saveMessage(message);
    }
}
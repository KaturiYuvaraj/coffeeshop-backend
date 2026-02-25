package com.yuva.coffeeshop.service;

import org.springframework.stereotype.Service;
import com.yuva.coffeeshop.entity.ContactMessage;
import com.yuva.coffeeshop.repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactMessage saveMessage(ContactMessage message) {
        return contactRepository.save(message);
    }
}
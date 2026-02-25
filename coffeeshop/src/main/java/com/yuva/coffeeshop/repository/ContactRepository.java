package com.yuva.coffeeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yuva.coffeeshop.entity.ContactMessage;

public interface ContactRepository extends JpaRepository<ContactMessage, Long> {
}
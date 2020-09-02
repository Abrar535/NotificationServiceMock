package com.example.notificationservicemock.repositories;

import com.example.notificationservicemock.models.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notifications,Integer> {
}

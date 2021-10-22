package com.ebenjs.inboxapi.repositories;

import com.ebenjs.inboxapi.domain.entities.Inmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmailRepository extends JpaRepository<Inmail, Long> {
}

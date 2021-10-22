package com.ebenjs.inboxapi.controllers;

import com.ebenjs.inboxapi.domain.dto.InmailDTO;
import com.ebenjs.inboxapi.services.InmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InmailController {
    //private static final Logger log = LoggerFactory.getLogger(InboxapiApplication.class);
    @Autowired
    private InmailService inmailService;

    @GetMapping("/inmails")
    public List<InmailDTO> getAllInmails() {
        return inmailService.getInmails();
    }
}

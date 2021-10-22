package com.ebenjs.inboxapi.services;

import com.ebenjs.inboxapi.repositories.InmailRepository;
import com.ebenjs.inboxapi.domain.dto.InmailDTO;
import com.ebenjs.inboxapi.domain.entities.Inmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InmailService {

    @Autowired
    private InmailRepository inmailRepository;
    public List<InmailDTO> getInmails(){
        return inmailRepository.findAll().stream().map(this::inmailEntityToDTO).collect(Collectors.toList());
    }

    private InmailDTO inmailEntityToDTO(Inmail inmail){
        InmailDTO inmailDTO = new InmailDTO();
        inmailDTO.setId(inmail.getId());
        inmailDTO.setMailContent(inmail.getMailContent());
        inmailDTO.setMailObject(inmail.getMailObject());
        inmailDTO.setSenderEmail(inmail.getSenderEmail());
        inmailDTO.setSenderName(inmail.getSenderName());
        return inmailDTO;
    }
}

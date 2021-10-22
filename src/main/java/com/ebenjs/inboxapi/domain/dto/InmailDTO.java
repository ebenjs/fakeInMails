package com.ebenjs.inboxapi.domain.dto;

import lombok.Data;

@Data
public class InmailDTO {
    private Long id;
    private String senderEmail;
    private String senderName;
    private String mailObject;
    private String mailContent;
}

package com.ebenjs.inboxapi.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inmail {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String senderEmail;
    private String senderName;
    private String mailObject;
    @Column(columnDefinition="TEXT")
    private String mailContent;

    public Inmail(String senderEmail, String mailObject, String mailContent) {
        this.senderEmail = senderEmail;
        this.mailObject = mailObject;
        this.mailContent = mailContent;
    }
}

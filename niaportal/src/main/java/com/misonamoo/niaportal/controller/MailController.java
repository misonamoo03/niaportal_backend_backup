package com.misonamoo.niaportal.controller;


import com.misonamoo.niaportal.service.MailService;
import com.misonamoo.niaportal.vo.MailVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MailController {
    private final MailService mailService;

    @GetMapping("/mail")
    public String dispMail() {
        return "mail";
    }

    @PostMapping("/mail")
    public void execMail(MailVO mailVO) {
        mailService.mailSend(mailVO);
    }
}
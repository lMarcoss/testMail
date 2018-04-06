package com.meltsan.mail.SendMail;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SendMailController {

    @GetMapping("/mail/{_username}/{_password}/{mailFrom}/{mailTo}/{subject}/{auth}/{enableTls}/{host}/{port}}")
    public String sendMail(
            @PathVariable("_username") String _username,
            @PathVariable("_password") String _password,
            @PathVariable("mailFrom") String mailFrom,
            @PathVariable("mailTo") String mailTo,
            @PathVariable("subject") String subject,
            @PathVariable("auth") String auth,
            @PathVariable("enableTls") String enableTls,
            @PathVariable("host") String host,
            @PathVariable("port") String port){
        return SendMail.sendMailGeneric(_username, _password, mailFrom, mailTo, subject, auth, enableTls, host, port);
    }

    @GetMapping("/")
    public String getInfo(){
        return "use HOST_NAME:port/mail/{_username}/{_password}/{mailFrom}/{mailTo}/{subject}/{auth}/{enableTls}/{host}/{port}}";
    }


}

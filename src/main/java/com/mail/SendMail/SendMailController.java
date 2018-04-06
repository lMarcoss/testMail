package com.mail.SendMail;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SendMailController {

    @GetMapping("/mail/send/{_username}/{_password}/{mailFrom}/{mailTo}/{subject}/{auth}/{enableTls}/{host}/{port}")
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

    @PostMapping("/mail/send")
    public String sendMail(@RequestBody ParamMail paramMail){
        System.out.println(paramMail.toString());
        return SendMail.sendMailGeneric(
                paramMail.get_username(), paramMail.get_password(),
                paramMail.getMailFrom(),
                paramMail.getMailTo(),
                paramMail.getSubject(),
                paramMail.getAuth(),
                paramMail.getEnableTls(),
                paramMail.getHost(),
                paramMail.getPort());
    }

    @GetMapping("/")
    public String getInfo(){
        return "use (get) HOST_NAME:port/mail/send/{_username}/{_password}/{mailFrom}/{mailTo}/{subject}/{auth}/{enableTls}/{host}/{port} \n or \n" +
                " (post) HOST_NAME:port/mail/send";
    }


}

package com.meltsan.mail.SendMail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static String sendMailGeneric(final String _username, final String _password, String mailFrom, String mailTo, String subject,
                                       String auth, String enableTls, String host, String port) {
        String messageSuccess;
        Session session;
        Properties props = new Properties();

        System.out.println("******* Send Mail... *******");
        try {
            // props.put("mail.smtp.auth", "false");
            // props.put("mail.smtp.starttls.enable", "false");
            // props.put("mail.smtp.host", "22.232.210.33");
            // props.put("mail.smtp.port", "25");
            props.put("mail.smtp.auth", auth);
            props.put("mail.smtp.starttls.enable", enableTls);
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", port);
            session = Session.getInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(_username, _password);
                }
            });
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailFrom));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailTo));
            message.setSubject(subject);
            message.setContent("Hello!!! Test mail", "text/html");
            message.setHeader("Content-Type", "text/html; charset=\"utf-8\"");
            message.setHeader("Content-Transfer-Encoding", "quoted-printable");
            Transport.send(message);
            System.out.println("******* Mail sent ....*******");
            messageSuccess = "Mail sent successfully....";
        } catch (Exception e) {
            e.printStackTrace();
            messageSuccess = e.getMessage();
        }
        return messageSuccess;
    }
}

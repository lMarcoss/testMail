package com.mail.SendMail;

public class ParamMail {
    private String _username;
    private String _password;
    private String mailFrom;
    private String mailTo;
    private String subject;
    private String auth;
    private String enableTls;
    private String host;
    private String port;

    public ParamMail() {
    }

    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getEnableTls() {
        return enableTls;
    }

    public void setEnableTls(String enableTls) {
        this.enableTls = enableTls;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ParamMail{" +
                    "_username='" + _username + '\'' +
                    ", _password='" + _password + '\'' +
                    ", mailFrom='" + mailFrom + '\'' +
                    ", mailTo='" + mailTo + '\'' +
                    ", subject='" + subject + '\'' +
                    ", auth='" + auth + '\'' +
                    ", enableTls='" + enableTls + '\'' +
                    ", host='" + host + '\'' +
                    ", port='" + port + '\'' +
                '}';
    }
}

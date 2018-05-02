package com.gmedia.webservice.mail.vo;

import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 1.
 * Github : http://github.com/betterfly88
 */

public class MailVO {
    private String subject;
    private String contents;
    private InternetAddress receiver;

    private List<String> internetAddress;
    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }

    public InternetAddress getReceiver() {
        return receiver;
    }

    public void setReceiver(InternetAddress receiver) {
        this.receiver = receiver;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public List<String> getInternetAddress() {
        return internetAddress;
    }

    public void setInternetAddress(List<String> internetAddress) {
        this.internetAddress = internetAddress;
    }
}

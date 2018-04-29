package com.gmedia.webservice.common;

import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.springframework.mail.SimpleMailMessage;

import com.google.common.collect.Lists;
/**
 * Created by betterFLY on 2018. 4. 29.
 * Github : http://github.com/betterfly88
 */

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MailMessage extends SimpleMailMessage {
    private static final long serialVersionUID = 1830106734321133565L;

    private List<File> attachments;
    private String encoding;
    private boolean htmlContent;

    public MailMessage() {
        super();
        super.setSentDate(Calendar.getInstance().getTime());
        this.attachments = Lists.newArrayList();
    }

    public MailMessage addAttachment(File file) {
        if (null != file) {
            this.attachments.add(file);
        }
        return this;
    }

    public MailMessage removeAttachment(File file) {
        if (null != file && this.attachments.contains(file)) {
            this.attachments.remove(file);
        }
        return this;
    }

    public List<File> getAttachments() {
        return Collections.unmodifiableList(this.attachments);
    }

    public boolean isMultipart() {
        return !this.attachments.isEmpty();
    }


}

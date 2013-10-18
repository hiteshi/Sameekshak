package com.cdac.sameekshak.helper;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public boolean sendMail(String receiver,String content,String subject) {
		
		final String username="sameekshak.test@gmail.com";
		final String password="$ameek$hak";
		//System.out.println("55");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		//System.out.println("66");
		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username,password);
			}
		});

		try {
			//System.out.println("888");
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("sameekshak.test@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(receiver));
			message.setSubject(subject);
			message.setText(content);

			Transport.send(message);

			System.out.println("Mail Send to "+receiver);
			return true;

		} catch (MessagingException e) {
			
			System.out.println("Sending mail error :"+e);
			return false;
		}
	}
public static void Main(String receiver,String content,String Subject) {
	SendMail sm = new SendMail();
	sm.sendMail(receiver,content,Subject);
		
}
}
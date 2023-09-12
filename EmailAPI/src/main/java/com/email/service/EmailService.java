package com.email.service;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import org.springframework.stereotype.Service;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

@Service
public class EmailService {

//	String message = "Hey Dhruv Sharma , Your OYO BOOKING IS Confirmed.";
//	String subject = "OYO Booking Confirmation mail";
//	String to = "";
//	String from = "";

	public boolean sendEmail(String message, String subject, String to) {

		boolean f = false;
		
		String from =  "";
		
		String host = "smtp.gmail.com";

		Properties properties = System.getProperties();

		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication("", "");
			}

		});

		session.setDebug(true);

		MimeMessage m = new MimeMessage(session);

		try {
//			m.setFrom(from);

			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			m.setSubject(subject);

			m.setText(message);

			Transport.send(m);

			System.out.println("sent Successfully");
			
			f =true;

		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return f;

	}
}

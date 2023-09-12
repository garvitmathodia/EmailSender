package com.email;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

@SpringBootApplication
public class EmailApiApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(EmailApiApplication.class, args);
//
//		String message = "Hey Dhruv Sharma , Your OYO BOOKING IS Confirmed.";
//		String subject = "OYO Booking Confirmation mail";
//		String to = "";
//		String from = "";
//
//		sendEmail(message , subject , to , from );
//
//		sendAttach(message, subject, to, from);
//
//	}
//
//	private static void sendAttach(String message, String subject, String to, String from) throws IOException {
//		String host = "smtp.gmail.com";
//
//		Properties properties = System.getProperties();
//
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.port", "465");
//		properties.put("mail.smtp.ssl.enable", "true");
//		properties.put("mail.smtp.auth", "true");
//
//		Session session = Session.getInstance(properties, new Authenticator() {
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//
//				return new PasswordAuthentication("", "");
//			}
//
//		});
//
//		session.setDebug(true);
//
//		MimeMessage m = new MimeMessage(session);
//
//		try {
//			m.setFrom(from);
//
//			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//			m.setSubject(subject);
//
//			String path = "G:\\photos2.0\\IMG_1219_192a76.jpg";
//
//			MimeMultipart mimeMultipart = new MimeMultipart();
//			
//			MimeBodyPart textMime = new MimeBodyPart();
//			
//			MimeBodyPart fileName = new MimeBodyPart();
//			
//			textMime.setText(message);
//			
//			File file = new File(path);
//			
//			fileName.attachFile(file);
//			
//			mimeMultipart.addBodyPart(textMime);
//			mimeMultipart.addBodyPart(fileName);
//			
//			
//			m.setContent(mimeMultipart);
//
//			Transport.send(m);
//
//			System.out.println("sent Successfully");
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
//	}
//
//	private static void sendEmail(String message, String subject, String to, String from) {
//
//		String host = "smtp.gmail.com";
//
//		Properties properties = System.getProperties();
//
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.port", "465");
//		properties.put("mail.smtp.ssl.enable", "true");
//		properties.put("mail.smtp.auth", "true");
//
//		Session session = Session.getInstance(properties, new Authenticator() {
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//
//				return new PasswordAuthentication("", "");
//			}
//
//		});
//
//		session.setDebug(true);
//
//		MimeMessage m = new MimeMessage(session);
//
//		try {
//			m.setFrom(from);
//
//			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//			m.setSubject(subject);
//
//			m.setText(message);
//
//			Transport.send(m);
//
//			System.out.println("sent Successfully");
//
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
//
	}

}

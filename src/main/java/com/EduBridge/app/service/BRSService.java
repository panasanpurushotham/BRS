package com.EduBridge.app.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.EduBridge.app.controller.BRSController;
import com.EduBridge.app.entity.BRSModel;
import com.EduBridge.app.repo.BRSRepository;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;



@Service
public class BRSService {
	@Autowired
	BRSRepository br;
	
	@Autowired
	BRSController cont;
	
	@Autowired
	JavaMailSender mailsender;

	public BRSService() {
	}

	public List getAllRecords() {
		return br.findAll();
	}

	public List retrieveId() {
		return br.findAll();
	}

	public Optional<BRSModel> getRecordById(int id) {
		Optional<BRSModel> pm = br.findById(id);
		return pm;
	}
	
	public BRSModel getEmail(String email) {
		return br.findByEmail(email);
	}

	public BRSModel getPlayerById(int id) {

		Optional<BRSModel> pm = br.findById(id);// inbuild DOA layer
		if (pm.isPresent()) {

			return pm.get();

		} else
			return null;
	}

	public void saveData(BRSModel p) {
		br.save(p);
	}

	public void updateData(BRSModel p1) {
		br.save(p1);
	}

	public void removePlayer(BRSModel p) {
		int id = p.getId();
		BRSModel q = br.getById(id);
		br.delete(q);
	}

//	public BRSModel loginuser(int id, String psw) throws Exception {
//
//		BRSModel l1 = br.getById(id);
//		System.out.println(l1.getPsw());
//		if (l1.getPsw().equals(psw)) {
//			return l1;
//		} else {
//			throw new Exception("Invalid Credentials");
//		}
//	}
	public BRSModel loginuser(String email, String psw) throws Exception {
		
				BRSModel l1 = br.findByEmail(email);
				System.out.println(l1.getPsw());
				if (l1.getPsw().equals(psw)) {
					return l1;
				} else {
					throw new Exception("Invalid Credentials");
				}
			}
	
	public void sendVerificationEmail(BRSModel user) throws UnsupportedEncodingException, MessagingException {
		String subject="Registration successfull";
		String senderName="BigBoyToys";
		BRSModel newUser = getEmail(user.getEmail());
		
		String mailContent="<p>Dear "+user.getName()
				+",<br>Please note your credentials "
				+"<br>User Id: "+newUser.getId()
				+ "<br>Email Id: "+user.getEmail()
				+"<br>Your password: "+user.getPsw()+"<p>";	
		
		
		MimeMessage message= mailsender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message);
		
		helper.setFrom("panasanpurushotham@gmail.com", senderName);
		helper.setTo(user.getEmail());
		helper.setSubject(subject);
		
		helper.setText(mailContent, true);
		mailsender.send(message);
		
	}
}

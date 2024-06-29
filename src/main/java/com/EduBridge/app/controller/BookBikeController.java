package com.EduBridge.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EduBridge.app.entity.BookBikeModel;
import com.EduBridge.app.service.BookBikeService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BookBikeController {
	@Autowired
	BookBikeService ps;
	@GetMapping("view1")
	public List<BookBikeModel> getAllRecords(){
		return this.ps.getAllRecords();
				
	}
	

	@PostMapping("getRecordById")
	public List<BookBikeModel> getRecordById(@RequestBody BookBikeModel id) {
		System.out.println("id "+id.getUserid());	
		return ps.getRecordById(id.getUserid());
	}
	@PostMapping("view1Id")
	public BookBikeModel getRecord(@RequestBody BookBikeModel id) {
	int id1=id.getId();
	System.out.println("test "+id1);
	return ps.getPlayerById(id1);
    }

	@PostMapping("insert1")
	public void addRecords(@RequestBody BookBikeModel p){
		System.out.println("p:"+ p.getUserid());
		this.ps.saveData(p);
	}
	@PostMapping("update1")
	public void modifyRecord(@RequestBody BookBikeModel p1) {
		this.ps.updateData(p1);
	}

	@PostMapping("delete1")
	public void deleteRecord(@RequestBody BookBikeModel p1 ) {
		this.ps.removePlayer(p1);
	}

}

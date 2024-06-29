package com.EduBridge.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.EduBridge.app.entity.BookBikeModel;
import com.EduBridge.app.repo.BookBikeRepository;

@Service
public class BookBikeService {
	@Autowired
	BookBikeRepository br;	
public BookBikeService() {	
}
public List getAllRecords() {
	return br.findAll();

}

public List<BookBikeModel> getRecordById(int id) {
	List<BookBikeModel> pm = br.findByuserid(id);
	return pm;	
}

public BookBikeModel getPlayerById(int id) {

	Optional<BookBikeModel> pm=br.findById(id);//inbuild DOA layer

	System.out.println("pm "+pm.get());
	if(pm.isPresent()) {

		return pm.get() ;

	}else 
	return null;
}
public void saveData(BookBikeModel p) {
	br.save(p);
}
public void updateData(BookBikeModel p1) {
	br.save(p1);
}
public void removePlayer(BookBikeModel p) {
	int id=p.getId();
	BookBikeModel q=br.getById(id);
	br.delete(q);
}


}
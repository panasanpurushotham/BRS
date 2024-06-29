package com.EduBridge.app.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.EduBridge.app.entity.BookBikeModel;

public interface BookBikeRepository extends JpaRepository<BookBikeModel,Integer> {
	List<BookBikeModel> findByuserid(int userid);
//	BookBikeModel findByuseridAndid(int userid,int id);
//	@Query(value="select id from book_bike_model where userid=27 and id=11;")
//	BookBikeModel findByUseridAndId(int userid, int id);
}

package com.EduBridge.app.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EduBridge.app.entity.BRSModel;

public interface BRSRepository extends JpaRepository<BRSModel,Integer>{

	  BRSModel findByEmail(String email);

}

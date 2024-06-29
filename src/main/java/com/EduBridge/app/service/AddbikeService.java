package com.EduBridge.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EduBridge.app.entity.AddbikeModel;
import com.EduBridge.app.repo.AddbikeRepository;


@Service
public class AddbikeService {
	@Autowired
	AddbikeRepository br;

	public AddbikeService() {
	}

	public List getAllRecords() {
		return br.findAll();
	}

	public AddbikeModel getPlayerById(int id) {

		Optional<AddbikeModel> pm = br.findById(id);// inbuild DOA layer
		if (pm.isPresent()) {

			return pm.get();

		} else
			return null;
	}

	public void saveData(AddbikeModel p) {
		br.save(p);
	}

	public void updateData(AddbikeModel p1) {
		br.save(p1);
	}

	public void removePlayer(AddbikeModel p) {
		int id = p.getId();
		AddbikeModel q = br.getById(id);
		br.delete(q);
	}

	public AddbikeModel getBikeDetails(Integer id) {
		return br.findById(id).get();
	}

}

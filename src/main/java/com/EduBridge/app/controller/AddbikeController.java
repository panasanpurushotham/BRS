package com.EduBridge.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.EduBridge.app.entity.AddbikeModel;
import com.EduBridge.app.service.AddbikeService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AddbikeController {

	@Autowired
	AddbikeService ps;
	@GetMapping("view2")
	public List<AddbikeModel> getAllRecords(){
		return this.ps.getAllRecords();
				
	}
	

//	    @PostMapping
//	    public ResponseEntity<AddbikeModel> addBike(@RequestParam("img") MultipartFile image,
//	                                                @RequestParam("brand") String brand,
//	                                                @RequestParam("model") String model,
//	                                                @RequestParam("price") String price) throws IOException {
//	        AddbikeModel bike = new AddbikeModel();
//	        bike.setBrand(brand);
//	        bike.setModel(model);
//	        bike.setPrice(price);

//	        if (!image.isEmpty()) {
//	            bike.setImg(image.getBytes()); // Store the image bytes
//	        }
//
//	        AddbikeModel savedBike = AddbikeModel.save(bike);
//	        return ResponseEntity.ok(savedBike);
//	    }

	    



	@PostMapping("view2I")
	public AddbikeModel getRecord(@RequestBody AddbikeModel id) {
	int id1=id.getId();
	return ps.getPlayerById(id1);
    }

	@PostMapping("insert2")
	public void addRecords(@RequestBody AddbikeModel p){
		this.ps.saveData(p);
	}
	@PostMapping("update2")
	public void modifyRecord(@RequestBody AddbikeModel p1) {
		this.ps.updateData(p1);
	}

	@PostMapping("delete2")
	public void deleteRecord(@RequestBody AddbikeModel p1 ) {
		this.ps.removePlayer(p1);
	}
	
	@GetMapping("/bike/{id}")
	public ResponseEntity<?> getBikeDetail(@PathVariable Integer id){
		AddbikeModel employee = ps.getBikeDetails(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
}

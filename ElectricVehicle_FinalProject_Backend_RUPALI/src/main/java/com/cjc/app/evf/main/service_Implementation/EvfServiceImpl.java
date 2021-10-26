package com.cjc.app.evf.main.service_Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.evf.main.model.DocumentDetails;
import com.cjc.app.evf.main.repository.EvfRepository;
import com.cjc.app.evf.main.service_Interface.EvfServiceI;

@Service
public class EvfServiceImpl implements EvfServiceI{
	@Autowired
	EvfRepository er;

	@Override
	public void saveDoucments(DocumentDetails value) {
		
		er.save(value);
		
	}

}

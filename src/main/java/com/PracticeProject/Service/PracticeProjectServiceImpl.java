package com.PracticeProject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.PracticeProject.Model.PracticeProject_Model;
@Service
public class PracticeProjectServiceImpl implements PracticeProjectService {
List<PracticeProject_Model> list;

	public PracticeProjectServiceImpl() {
	list=new ArrayList<>();
	list.add(new PracticeProject_Model(1,"Srika","Hyderabad"));
	list.add(new PracticeProject_Model(2,"Dinesh","India"));
	list.add(new PracticeProject_Model(3,"Rohit","Kadapa"));
}

	@Override
	public List<PracticeProject_Model> getPractices() {
		
		return list;
	}

	@Override
	public PracticeProject_Model getPractice(int id) {
		PracticeProject_Model practiceProjectModel=null;
		for(PracticeProject_Model p:list) {
			if(p.getId()==id) {
				practiceProjectModel=p;
				break;
			}
			
		}
		return practiceProjectModel;
	}

	@Override
	public PracticeProject_Model addPractice(PracticeProject_Model practice) {
		list.add(practice);
		return practice;
	}
	
	@Override
	public PracticeProject_Model updatePractice(PracticeProject_Model practice,int Id) {
		
		for(PracticeProject_Model p:list) {
			if(p.getId()==Id) {
				if(p.getName()!=practice.getName()) {
					p.setName(practice.getName());
				}
				if(p.getAddress()!=practice.getAddress()) {
					p.setAddress(practice.getAddress());
				}
				break;
		
			}
		}
		return practice ;
	}

	@Override
	public String deletePractice(int id) {
		Boolean b=false;
		for(PracticeProject_Model p:list) {
			if(p.getId()==id) {
				b=list.remove(p);
				break;
			}
		}
		if(b==true)
		return "record deleted";
		else
			return "no record found";
	}

}

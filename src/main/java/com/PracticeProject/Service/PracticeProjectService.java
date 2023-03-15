package com.PracticeProject.Service;

import java.util.List;



import com.PracticeProject.Model.PracticeProject_Model;


public interface PracticeProjectService {
public List<PracticeProject_Model> getPractices();
public PracticeProject_Model getPractice(int id);
public PracticeProject_Model addPractice(PracticeProject_Model practice);
public PracticeProject_Model updatePractice(PracticeProject_Model practice,int Id);
public String deletePractice(int id);
}

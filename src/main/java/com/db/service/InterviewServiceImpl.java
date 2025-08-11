package com.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.dao.InterviewDaoImpl;
import com.db.entity.Interview;

@Service
public class InterviewServiceImpl {

	@Autowired
	private InterviewDaoImpl daoImpl;

	// Method to schedule a new interview
	public String scheduleInterview(Interview interview) {
		return daoImpl.scheduleInterview(interview);
	}

	// Method to fetch all scheduled interviews
	public List<Interview> getAllInterviews() {
		return daoImpl.getAllInterviews();
	}

	// Method to cancel an interview by ID
	public String cancelInterview(Long id) {
		return daoImpl.cancelInterview(id);
	}

	// Method to update interview details
	public String updateInterview(Interview interview) {
		return daoImpl.updateInterview(interview);
	}

}

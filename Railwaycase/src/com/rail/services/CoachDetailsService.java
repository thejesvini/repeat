package com.rail.services;


import java.sql.SQLException;
import java.util.ArrayList;

import com.rail.beans.CoachDetails;

import com.rail.daofactory.DaoFactory;
import com.rail.daointerfaces.CoachDetailsDao;


public class CoachDetailsService {
	public ArrayList<CoachDetails> coachService()throws ClassNotFoundException,SQLException
	{
		CoachDetailsDao coachDetailsDao=DaoFactory.getCoachDetailsService();
		return  coachDetailsDao.getCoachDetails();
	}

}

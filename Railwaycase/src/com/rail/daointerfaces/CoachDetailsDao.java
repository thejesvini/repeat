package com.rail.daointerfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import com.rail.beans.CoachDetails;
import com.rail.beans.Login;

public interface CoachDetailsDao {

	public abstract ArrayList<CoachDetails> getCoachDetails() throws ClassNotFoundException, SQLException;
}

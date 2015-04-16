package com.rail.daointerfaces;

import java.sql.SQLException;
import java.util.ArrayList;


import com.rail.beans.CoachDetails;
import com.rail.beans.StationDetails;
import com.rail.beans.TrainDetails;

public interface TrainsDetailsDao {
	//public abstract Hashtable validateTrainDetails() throws ClassNotFoundException, SQLException;
	public ArrayList<TrainDetails> getTrainList() throws SQLException, ClassNotFoundException;
	public ArrayList<StationDetails> getStationList() throws SQLException, ClassNotFoundException;
	public ArrayList<CoachDetails> getCoachList() throws SQLException, ClassNotFoundException;
}

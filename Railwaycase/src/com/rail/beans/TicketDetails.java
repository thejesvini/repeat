package com.rail.beans;

public class TicketDetails {
	private int ticketId;
	private int onewayTicket;
	private int returnTicket;
	private double amountOne;

	private double amountReturn;
	private double amount;
	private int trainNo;
	private int coachId;
	private String date1;
	private String coachName;
	
	private double coachOneWiseAmount;
	private double coachReturnWiseAmount;
	private double totalTrainAmount;
	
	public double getCoachOneWiseAmount() {
		return coachOneWiseAmount;
	}
	public void setCoachOneWiseAmount(double coachOneWiseAmount) {
		this.coachOneWiseAmount = coachOneWiseAmount;
	}
	public double getCoachReturnWiseAmount() {
		return coachReturnWiseAmount;
	}
	public void setCoachReturnWiseAmount(double coachReturnWiseAmount) {
		this.coachReturnWiseAmount = coachReturnWiseAmount;
	}
	public double getTotalTrainAmount() {
		return totalTrainAmount;
	}
	public void setTotalTrainAmount(double totalTrainAmount) {
		this.totalTrainAmount = totalTrainAmount;
	}
	public double getAmountOne() {
		return amountOne;
	}
	public void setAmountOne(double amountOne) {
		this.amountOne = amountOne;
	}
	public double getAmountReturn() {
		return amountReturn;
	}
	public void setAmountReturn(double amountReturn) {
		this.amountReturn = amountReturn;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getOnewayTicket() {
		return onewayTicket;
	}
	public void setOnewayTicket(int onewayTicket) {
		this.onewayTicket = onewayTicket;
	}
	public int getReturnTicket() {
		return returnTicket;
	}
	public void setReturnTicket(int returnTicket) {
		this.returnTicket = returnTicket;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public int getCoachId() {
		return coachId;
	}
	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	

}

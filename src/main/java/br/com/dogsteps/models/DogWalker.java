package br.com.dogsteps.models;

import java.util.ArrayList;

public class DogWalker extends User {

	private TimeSchedule timeSchedule;
	private ArrayList<Rating> ratings;
	private double medianScore;

	public DogWalker(String name, String photoUrl, int age, String cpf, String email, String password, Address address, TimeSchedule timeSchedule, TimeSchedule timeSchedule1, ArrayList<Rating> ratings, double medianScore) {
		super(name, photoUrl, age, cpf, email, password, address, timeSchedule);
		this.timeSchedule = timeSchedule1;
		this.ratings = ratings;
		this.medianScore = medianScore;
	}

	public TimeSchedule getTimeSchedule() {
		return timeSchedule;
	}

	public void setTimeSchedule(TimeSchedule timeSchedule) {
		this.timeSchedule = timeSchedule;
	}

	public ArrayList<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(ArrayList<Rating> ratings) {
		this.ratings = ratings;
	}

	public double getMedianScore() {
		return medianScore;
	}

	public void setMedianScore(double medianScore) {
		this.medianScore = medianScore;
	}

	public DogWalker(){}
}

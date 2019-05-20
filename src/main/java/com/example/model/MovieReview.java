package com.example.model;

public class MovieReview {
private int id;
	
	private String movieName;
	
	private String movieSummary;
	
	private float rating;
	
	private String review;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieSummary() {
		return movieSummary;
	}

	public void setMovieSummary(String movieSummary) {
		this.movieSummary = movieSummary;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public MovieReview(int id, String movieName, String movieSummary, float rating, String review) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieSummary = movieSummary;
		this.rating = rating;
		this.review = review;
	}

	public MovieReview() {
		super();
	}
	

}

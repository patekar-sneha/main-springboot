package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.MovieReview;

@RestController
public class MainController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(path = "/movies/{movieName}", produces = "application/json")
	public String getMovieDetails(@PathVariable("movieName") String movieName) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String url = "http://35.184.46.26:8087"+movieName;
		return restTemplate.exchange(url, HttpMethod.GET, entity, String.class)
				.getBody();
	}
	
	@GetMapping(path = "/movies/all", produces = "application/json")
	public String getMovieReview() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String url = "http://35.184.184.175:8086"+"/movies/all";
		return restTemplate.exchange(url, HttpMethod.GET, entity, String.class)
				.getBody();
	}
	

	@PostMapping(path = "/movies/review", produces = "application/json")
	public String createReview(@RequestBody MovieReview movieReview) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<MovieReview> entity = new HttpEntity<MovieReview>(movieReview, headers);
		String url = "http://35.184.184.175:8086"+"/movies/review";
		return restTemplate.exchange(url, HttpMethod.POST, entity, String.class)
				.getBody();
	}


}

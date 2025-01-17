package com.coderhouse.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.coderhouse.interfaces.UserRestInterface;
import com.coderhouse.models.User;

@Component
public class UserRestApi implements UserRestInterface{

//	URL DE MI API
	private final String BASE_URL = "https://6786a51ef80b78923aa7b3de.mockapi.io/users";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<User> getAllUsers() {
		try {
			@SuppressWarnings("unchecked")
			List<User> users = restTemplate
			.exchange(BASE_URL, HttpMethod.GET, null, List.class).getBody();
			return users;
		} catch(Exception e) {
			throw new RuntimeException("Error getting users" + e.getMessage(), e);
		}
	}

	@Override
	public User getUserById(String id) {
		try {
			String url = BASE_URL + "/" + id;
			return restTemplate.getForObject(url, User.class);
		} catch(Exception e) {
			throw new RuntimeException("Error getting user" + e.getMessage(), e);
		}
	}

	@Override
	public User addUser(User user) {
		try {
			return restTemplate.postForObject(BASE_URL, user, User.class);
		}catch(Exception e) {
			throw new RuntimeException("Error adding user" + e.getMessage(), e);
		}
	}

	@Override
	public User updateUser(User user) {
		try {
			String url = BASE_URL + "/" + user.getId();
			restTemplate.put(url, user);
			return user;
		}catch(Exception e) {
			throw new RuntimeException("Error updating user" + e.getMessage(), e);
		}
	}

	@Override
	public void deleteUser(String id) {
		try {
			String url = BASE_URL + "/" + id;
			restTemplate.delete(url);
		}catch(Exception e) {
			throw new RuntimeException("Error deleting user" + e.getMessage(), e);
		}
	}

	
}

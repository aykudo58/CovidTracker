package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.User;
import app.repository.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepository;
	public User findByUsername(String username)
	{
		return userRepository.findByUsername(username);
	}
	public boolean existsByUsername(String username)
	{
		return userRepository.existsByUsername(username);
	}
	public void save(User user)
	{
		userRepository.save(user);
	}
}
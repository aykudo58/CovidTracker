package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Country;
import app.repository.CountryRepository;

@Service
public class CountryService
{
	@Autowired
	private CountryRepository countryRepository;
	public void save(Country country)
	{
		countryRepository.save(country);
	}
	public void update(Country country)
	{
		countryRepository.save(country);
	}
	public void deleteById(int id)
	{
		countryRepository.deleteById(id);
	}
	public Country findById(int id)
	{
		return countryRepository.findById(id).orElse(null);
	}
	public List<Country> findAll()
	{
		return countryRepository.findAll();
	}
}
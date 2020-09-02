package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.Country;
import app.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController
{
	@Autowired
	private CountryService countryService;
	@GetMapping
	public List<Country> findAll()
	{
		return countryService.findAll();
	}
	@GetMapping("/{id}")
	public Country findById(@PathVariable int id)
	{
		return countryService.findById(id);
	}
	@PostMapping
	public Country save(@RequestBody Country country)
	{
		countryService.save(country);
		return country;
	}
	@PutMapping
	public void update(@RequestBody Country country)
	{
		countryService.update(country);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		countryService.deleteById(id);
	}
}
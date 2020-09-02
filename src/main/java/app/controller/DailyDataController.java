package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.DailyData;
import app.service.DailyDataService;

@RestController
@RequestMapping("/dailyData")
public class DailyDataController
{
	@Autowired
	private DailyDataService dailyDataService;
	@GetMapping
	public List<DailyData> findAll()
	{
		return dailyDataService.findAll();
	}
	@GetMapping("/{id}")
	public DailyData findById(@PathVariable int id)
	{
		return dailyDataService.findById(id);
	}
	@PostMapping
	public DailyData save(@RequestBody DailyData dailyData)
	{
		dailyDataService.save(dailyData);
		return dailyData;
	}
	@PutMapping
	public void update(@RequestBody DailyData dailyData)
	{
		dailyDataService.update(dailyData);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		dailyDataService.deleteById(id);
	}
	@GetMapping("/country/{id}")
	public List<DailyData> findByCountryId(@PathVariable int id)
	{
		return dailyDataService.findByCountryId(id);
	}
}
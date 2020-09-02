package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.DailyData;
import app.repository.DailyDataRepository;

@Service
public class DailyDataService
{
	@Autowired
	private DailyDataRepository dailyDataRepository;
	public void save(DailyData dailyData)
	{
		dailyDataRepository.save(dailyData);
	}
	public void update(DailyData dailyData)
	{
		dailyDataRepository.save(dailyData);
	}
	public void deleteById(int id)
	{
		dailyDataRepository.deleteById(id);
	}
	public DailyData findById(int id)
	{
		return dailyDataRepository.findById(id).orElse(null);
	}
	public List<DailyData> findAll()
	{
		return dailyDataRepository.findAll();
	}
	public List<DailyData> findByCountryId(int id)
	{
		return dailyDataRepository.findByCountryId(id);
	}
}
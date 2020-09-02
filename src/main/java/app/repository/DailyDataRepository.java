package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.DailyData;

import java.util.List;

public interface DailyDataRepository extends JpaRepository<DailyData,Integer>
{
    List<DailyData> findByCountryId(int id);
}
package by.agro.plant;

import java.util.List;

public interface PlantPlantingDao {

    void save(PlantPlanting plantPlanting);

    void update(PlantPlanting plantPlanting);

    PlantPlanting get(long id);

    PlantPlanting delete(long id);

    List<PlantPlanting> findAll();
}

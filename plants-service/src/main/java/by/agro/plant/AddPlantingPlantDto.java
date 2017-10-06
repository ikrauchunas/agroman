package by.agro.plant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddPlantingPlantDto {

    private long id;
    private String name;
    private double sowingArea;
    private String maintainer;
}

package by.agro.plant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlantPlanting {

    private long id;
    private String name;
    private double sowingArea;
    private String maintainer;
}

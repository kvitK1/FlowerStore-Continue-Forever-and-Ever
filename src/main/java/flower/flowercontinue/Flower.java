package flower.flowercontinue;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter
public class Flower {
    @Id
    @SequenceGenerator(name = "flower_sequence",
                       sequenceName = "flower_sequence",
                       allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flower_sequence"
    )
    private Long id;
    private FlowerType flowerType;
    private double price;
    private FlowerColor color;
    private double sepalLength;
    public Flower(Long id, double sepalLength, FlowerColor color, double price, FlowerType flowerType) {
        this.id = id;
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }
}
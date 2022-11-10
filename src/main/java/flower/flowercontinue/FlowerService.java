package flower.flowercontinue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @GetMapping
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

//    @GetMapping
//    public List<Flower> getFlowers() {
////        Flower tulip = new Flower(1L, 3.4, FlowerColor.BLUE, 24.8, FlowerType.TULIP);
//        return List.of(new Flower(1L, 3.4, FlowerColor.BLUE, 24.8, FlowerType.TULIP));
//    }
}

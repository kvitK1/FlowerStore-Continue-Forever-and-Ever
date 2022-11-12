package flower.flowercontinue.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/flowers")
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public void addFlowers(@RequestBody Flower flower) { flowerService.addFlowers(flower); }
}

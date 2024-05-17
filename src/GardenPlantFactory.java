public class GardenPlantFactory implements PlantFactory {
    @Override
    public Tree createTree() {
        return new PineTree();
    }

    @Override
    public Flower createFlower() {
        return new TulipFlower();
    }
}
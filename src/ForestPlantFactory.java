public class ForestPlantFactory implements PlantFactory {
    @Override
    public Tree createTree() {
        return new OakTree();
    }

    @Override
    public Flower createFlower() {
        return new RoseFlower();
    }
}
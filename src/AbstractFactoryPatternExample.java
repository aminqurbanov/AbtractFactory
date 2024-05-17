public class AbstractFactoryPatternExample {
    public static void main(String[] args) {

        PlantFactory forestFactory = new ForestPlantFactory();
        Tree forestTree = forestFactory.createTree();
        Flower forestFlower = forestFactory.createFlower();

        forestTree.grow();
        forestFlower.bloom();


        PlantFactory gardenFactory = new GardenPlantFactory();
        Tree gardenTree = gardenFactory.createTree();
        Flower gardenFlower = gardenFactory.createFlower();

        gardenTree.grow();
        gardenFlower.bloom();
    }
}

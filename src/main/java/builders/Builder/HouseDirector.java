package builders.Builder;

public class HouseDirector {

    House createCommonHouse(HouseBuilder builder){
        builder.setDog(3).setWalls(4).setRoof(1).setFence(0).setWindows(2).setDoors(1);
        return builder.getResult();
    }

    House createLuxuryHouse(HouseBuilder builder){
        builder.setDog(1);
        builder.setWalls(10);
        builder.setRoof(2);
        builder.setFence(1);
        builder.setWindows(15);
        builder.setDoors(3);
        return builder.getResult();
    }
}

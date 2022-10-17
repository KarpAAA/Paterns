package builders.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        HouseDirector director = new HouseDirector();

        House houseCommon = director.createCommonHouse(builder);
        houseCommon.showHouseInfo();

        //House luxuryHouse = director.createLuxuryHouse(builder);
        //luxuryHouse.showHouseInfo();

    }
}

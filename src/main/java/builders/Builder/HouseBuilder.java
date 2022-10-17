package builders.Builder;

public class HouseBuilder{
    private  int windows;
    private  int doors;
    private  int roof;
    private  int walls;
    private  int fence;
    private  int dog;


    public HouseBuilder setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public HouseBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public HouseBuilder setRoof(int roof) {
        this.roof = roof;
        return this;
    }

    public HouseBuilder setWalls(int walls) {
        this.walls = walls;
        return this;
    }

    public HouseBuilder setFence(int fence) {
        this.fence = fence;
        return this;
    }

    public HouseBuilder setDog(int dog) {
        this.dog = dog;
        return this;
    }

    public House getResult(){
        return new House(windows,doors,roof,walls,fence,dog);
    }
}

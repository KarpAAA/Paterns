package builders.Builder;

public class House {
    private final int windows;
    private final int doors;
    private final int roof;
    private final int walls;
    private final int fence;
    private final int dog;

    public House(int windows,int doors,int roof,int walls,int fence,int dog){
        this.windows = windows;
        this.doors = doors;
        this.roof = roof;
        this.walls = walls;
        this.fence = fence;
        this.dog = dog;
    }

    public void showHouseInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Im a house:\n");
        if(windows!=0)sb.append("I have ").append(windows).append(" windows;\n");
        if(doors!=0)sb.append("I have ").append(doors).append(" doors;\n");
        if(roof!=0)sb.append("I have ").append(roof).append(" roof;\n");
        if(walls!=0)sb.append("I have ").append(walls).append(" walls;\n");
        if(fence!=0)sb.append("I have ").append(fence).append(" fence;\n");
        if(dog!=0)sb.append("I have ").append(dog).append(" dog;\n");

        System.out.println(sb);
    }
}

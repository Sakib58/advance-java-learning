package dp.builder_03;

public class Main {
    public static void main(String[] args) {
        House.Builder builder = new House.Builder();
        House house = builder.setFoundation("foundation_1").setRoof("roof").build();
        House house2 = builder.setFoundation("foundation_2").setInterior("interior").build();
        System.out.println(house.getFoundation());
        System.out.println(house2.getFoundation());
    }
}

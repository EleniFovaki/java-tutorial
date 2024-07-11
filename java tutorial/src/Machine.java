public class Machine implements Info{
    private int id = 5;
    public void start(){
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine Id is: " + id);
    }
}

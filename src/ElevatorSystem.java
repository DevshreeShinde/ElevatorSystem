
public class ElevatorSystem {
    public static void main(String[] args) throws Exception {
       ElevatorController controller = new ElevatorController(2, 0, 10);
       
        FloorButton button = new FloorButton(5, controller);
        FloorButton button3 = new FloorButton(7, controller);
        FloorButton button2 = new FloorButton(2, controller);

        button2.pressButton();
        button3.pressButton();
        button.pressButton();
    }
}

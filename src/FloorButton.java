public class FloorButton {
    private int floor;
    private ElevatorController controller;

    public FloorButton(int floor, ElevatorController controller) {
        this.floor = floor;
        this.controller = controller;
    }

    public void pressButton() {
        System.out.println("FloorButton: Button pressed for floor " + floor);
        controller.requestElevator(floor);
    }
}

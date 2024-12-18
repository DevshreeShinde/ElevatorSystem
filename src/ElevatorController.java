// This class is responsible for controlling the elevators. It has a list of elevators and assigns the closest elevator to a request.

public class ElevatorController {
    private Elevator[] elevators;

    public ElevatorController(int numElevators, int minFloor, int maxFloor) {
        elevators = new Elevator[numElevators];
        for (int i = 0; i < numElevators; i++) {
            elevators[i] = new Elevator(minFloor,maxFloor,i);
            new Thread(elevators[i]).start();;
        }
    }
    public Elevator getNearesElevator(int floor) {
        Elevator nearest = null;
        int minDistance = Integer.MAX_VALUE;
        for (Elevator elevator : elevators) {
            int distance = Math.abs(elevator.getCurrentFloor() - floor);
            if (distance < minDistance) {
                minDistance = distance;
                nearest = elevator;
            }
        }
        return nearest;
    }
    
    public void requestElevator(int floor) {
        Elevator elevator = getNearesElevator(floor);
        elevator.moveElevator(floor);
    }
    
}

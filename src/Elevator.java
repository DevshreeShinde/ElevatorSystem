public class Elevator implements Runnable{
    private int currentFloor;
    private int maxFloor;
    private int minFloor;
    private ElevatorState state;
    private boolean isMoving;
    private int id;

    public Elevator(int minFloor, int maxFloor,int id) {
        this.currentFloor = minFloor;
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
        this.state = ElevatorState.IDLE;
        this.isMoving = false;
        this.id = id;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public ElevatorState getState() {
        return state;
    }
    public int getId() {
        return id;
    }

    @Override
    public void run() {
       while (true) {
            try {
                Thread.sleep(500);  // Sleep to prevent tight loop and simulate idle time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void moveElevator(int floor) {
        if (currentFloor < floor) {
            state = ElevatorState.MOVING_UP;
            isMoving = true;
            while (currentFloor < floor) {
                currentFloor++;
                System.out.println("Elevator " + id + ": Moving up to floor " + currentFloor);
                try {
                    Thread.sleep(1000);  // Add delay to simulate time taken to move 1 floor (1 second)
                } catch (InterruptedException e) {
                    System.out.println("Elevator " + id + " movement interrupted");
                }
            }
        } else if (currentFloor > floor) {
            state = ElevatorState.MOVING_DOWN;
            isMoving = true;
            while (currentFloor > floor) {
                currentFloor--;
                System.out.println("Elevator " + id + ": Moving down to floor " + currentFloor);
                try {
                    Thread.sleep(1000);  // Add delay to simulate time taken to move 1 floor (1 second)
                } catch (InterruptedException e) {
                    System.out.println("Elevator " + id + " movement interrupted");
                }
            }
        }
        isMoving = false;
        state = ElevatorState.IDLE;
        System.out.println("Elevator " + id + ": Arrived at floor " + currentFloor);
    }
}

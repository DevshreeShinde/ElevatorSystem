# ElevatorSystem
This repository implements a simulation of a multi-elevator system where multiple elevators are controlled concurrently in a building with defined floor ranges.

## Features

- Multiple elevators running independently
- Elevators can move up and down between specified floor ranges
- Each elevator operates in its own thread for concurrent movement
- Simple console-based simulation with real-time floor updates

## Project Structure

The project contains the following main components:

1. **ElevatorController**:  
   - Manages multiple elevators.
   - Initializes each elevator and starts them concurrently using threads.

2. **Elevator**:  
   - Simulates an elevator with basic movement between floors.
   - Operates in its own thread and prints real-time updates about its current state.

## Installation

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/your-username/ElevatorSystem.git

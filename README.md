# cs1027b-project3
# What This Project Does

This project is a Maze Solver implemented in Java that uses recursive backtracking to find a path from a start position to the end position in a maze. It visually displays the solving process in real-time, allowing users to observe the pathfinding algorithm as it works.

Features of the Project
Recursive Maze Solver:

Traverses a maze using recursive backtracking.
Explores all possible directions (down, right, up, left) to find the correct path.
Maze Visualization:

Animates the solving process by updating the maze in real-time using a MazeVisualizer.
Marks visited cells with '+' and backtracks when necessary.
Path Tracking:

Records the sequence of moves (down, right, up, left) needed to solve the maze.
Customizable Mazes:

Reads maze layouts from text files (e.g., maze1.txt, maze2.txt).
Allows users to easily switch to different mazes by specifying a file name.
Outputs Results:

Prints the solved path to the console in reverse order (from start to end).
Indicates if no solution exists.
How to Run It
Environment Setup:

Install Java Development Kit (JDK) if not already installed.
Place maze text files (e.g., maze1.txt, maze2.txt) in the same directory as the program.
Maze File Format:

The maze is represented as a 2D grid of characters:
' ' (space): Walkable path.
'#': Wall/obstacle.
'S': Start position.
'E': End position.

Technologies/Libraries Used:
Language: Java
Core Libraries:
java.util: For ArrayList to store the path.
java.io: For reading maze files.
Custom Components:
MazeVisualizer class for real-time visualization of the maze-solving process.
Maze class for loading and managing the maze data.
This project demonstrates skills in:

Recursive algorithms (backtracking).
File I/O operations for dynamic input.
Visualization and animation using Java.
Problem-solving and debugging complex algorithms.

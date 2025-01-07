import java.util.ArrayList;

public class MazeSolver {

    public static boolean solveMaze(char[][] maze, int row, int col, ArrayList<String> path, MazeVisualizer visualizer) {

        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length || maze[row][col] == '#' || maze[row][col] == '+') {
            return false;
        }

        // our check if the current position is the end of the maze
        if (maze[row][col] == 'E') {
            return true;
        }

        // to mark the current position as visited
        maze[row][col] = '+';
        visualizer.repaint();
        try {
            Thread.sleep(100); // delay (100ms) to see the animation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         // oour methods to explore all possible directions of the given maze down, right, up, left
        if (solveMaze(maze, row + 1, col, path, visualizer)) {
            path.add("down");                  // down
            return true; 
        }
        if (solveMaze(maze, row, col + 1, path, visualizer)) {
            path.add("right");             // right 
            return true;
        }
        if (solveMaze(maze, row - 1, col, path, visualizer)) {
            path.add("up");          //up
            return true;
        }
        if (solveMaze(maze, row, col - 1, path, visualizer)) {
            path.add("left");      // left
            return true;
        }

        // to unmark the current position visited if no path is found
        maze[row][col] = ' ';
        visualizer.repaint();
        try {
            Thread.sleep(100); // delay (100ms) to see the animation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return false;          // no path found
    }

 

    public static void main(String[] args) {
        Maze maze = new Maze("maze4.txt"); // to change the maze you're solving, change this filename (maze1.txt, maze2.txt, maze3.txt, maze4.txt, or maze5.txt)
        maze.printMaze();

        ArrayList<String> path = new ArrayList<>();

        // create a frame to display the maze
        MazeVisualizer visualizer = new MazeVisualizer(maze.getMaze(), path);
        visualizer.display();

        if (solveMaze(maze.getMaze(), maze.getStartRow(), maze.getStartCol(), path, visualizer)) {
            System.out.println("Maze solved:");
            for (int i = path.size() - 1; i >= 0; i--) {
                System.out.println(path.get(i));
            }
        } else {
            System.out.println("No solution found for the maze.");
        }
    }
}

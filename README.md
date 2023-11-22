# Maze Algorithms

## Description

This project, as its name indicates, aims to investigate a little more about algorithms, particularly when applied to mazes, both in their creation and in their resolution.
This project topic probably doesn't have much applicability in the real world, but as it was always a topic that interested me, and I decided to put it into practice, in order to try to deepen my knowledge on the subject a little more.
The project will be implemented in the Java language with JavaFX, not only to learn more about mazes and their algorithms but also to provide a better visualization of what is happening.

## Main topics that will be covered

- Maze Generation Algorithms
  - Recursive backtracking:
    The computer removes the wall between the two cells and marks the new cell as visited, and adds it to the stack to facilitate backtracking. The computer continues this process, with a cell that has no unvisited neighbours being considered a dead-end. When at a dead-end it backtracks through the path until it reaches a cell with an unvisited neighbour, continuing the path generation by visiting this new, unvisited cell (creating a new junction). This process continues until every cell has been visited, causing the computer to backtrack all the way back to the beginning cell. We can be sure every cell is visited.
  - More topics will eventually emerge as the project progresses.
- Maze Solving Algorithms
  - Random mouse algorithm:
    Is a trivial method that can be implemented by a very unintelligent robot or perhaps a mouse. It is simply to proceed following the current passage until a junction is reached, and then to make a random decision about the next direction to follow. Although such a method would always eventually find the right solution, this algorithm can be extremely slow.
  - More topics will eventually emerge as the project progresses.

## Topics that are currently being applied

- Recursive backtraking
- Random mouse algorithm

## Topics that are done in the project

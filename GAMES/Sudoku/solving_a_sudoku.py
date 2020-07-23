from itertools import product

def solve_sudoku(puzzle):
    for (row, col) in product(range(0, 9), repeat = 2):
        if puzzle[row][col] == 0:
            for num in range(1, 10):
                allowed = True
                for i in range(0, 9):
                    if puzzle[i][col] == num or puzzle[row][i] == num:
                        allowed = False
                        break
                
                for (i, j) in product(range(0, 3), repeat = 2):
                    if puzzle[row - (row % 3 + i)][col - (col % 3 + j)] == num:
                        allowed = False
                        break
                    
                if allowed:
                    puzzle[row][col] = num
                    trial = solve_sudoku(puzzle)
                    if trial:
                        return trial
                    else:
                        puzzle[row][col] = 0
            return False
    return puzzle

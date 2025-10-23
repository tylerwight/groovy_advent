List<String> file_contents = new File('./smallpuzzle').readLines()




def solve_left_right(lines){
    def count = 0
    for (line in lines){
        count += (line.findAll("XMAS").size()) + (line.findAll("SAMX").size())
        println("Found ${count} instances of XMAS or SAMX")
    }
    return count
}

def solve_up_down(lines){
    int rows = lines.size()
    int cols = lines[0].size()
    List<String> lines_rotated = (0..<cols).collect {new char[rows]}

    // rotate array by 90 degrees, down->up is now left->right
    for (int row = 0; row < rows; row++){
        for (int col = 0; col < cols; col++){

            row_flipped = rows - 1 - row //start from the end of the line so rows aren't backwards
            lines_rotated[col][row_flipped] = lines[row][col]
        }
    }

    def count = 0
    count = solve_left_right(lines)
    return count
}

def solve_diag(lines){
    return 0
}

def solve_puzzle(lines){
    def answer = 0
    println("solving left-right")
    answer += solve_left_right(lines)
    println("solving up-down")
    answer += solve_up_down(lines)
    answer += solve_diag(lines)
    println("Answer = ${answer}")
 
}


solve_puzzle(file_contents)






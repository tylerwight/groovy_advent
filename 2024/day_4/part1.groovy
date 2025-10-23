List<String> file_contents = new File('./puzzleinput').readLines()




def solve_left_right(lines){
    def count = 0
    for (line in lines){
        count = (line.findAll("XMAS").size()) + (line.findAll("SAMX").size())
        println("Found ${count} instances of XMAS or SAMX")
    }
    return count
}

def solve_up_down(lines){
    return 0
}

def solve_diag(lines){
    return 0
}

def solve_puzzle(lines){
    def answer = 0
    answer += solve_left_right(lines)
    answer += solve_up_down(lines)
    answer += solve_diag(lines)
    println("Answer = ${answer}")
 
}


solve_puzzle(file_contents)






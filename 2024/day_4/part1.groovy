List<String> file_contents = new File('./puzzleinput').readLines()

def answer = 0


def solve_left_right(lines){
    for (line in lines){
        def count = (line.findAll("XMAS").size()) + (line.findAll("SAMX").size())
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

solve_left_right(file_contents)


println("Answer = ${answer}")





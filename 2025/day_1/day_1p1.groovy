List<String> file_contents = new File('./puzzleinput').readLines()


Integer answer = 0
Integer dial = 50
Integer sign = 1

// match groups: (starts with L or R) (any number of digits in a row)
def regex = ~/(^[LR])(\d+)/


println("dial: " + dial)
for(line in file_contents){
    def groups = (line =~ regex)
    def letter = groups[0][1]
    def number = groups[0][2] as int
    def prev_dial = dial

    if (letter == 'L'){sign = -1}
    if (letter == 'R'){sign = 1}

    println("letter = " + letter + " number = " + number + " sign = " + sign)
    
    
    dial = dial + (number * sign)

    while (dial > 99 || dial < 0){
        if (dial > 99){
            dial = dial - 100
        }
        if (dial < 0){
            dial = dial + 100
        }
    }
    println("dial: " + dial)
    if (dial == 0){answer += 1}
}





println("Answer = " + answer)
List<String> file_contents = new File('./puzzleinput').readLines()

def answer = 0



for(line in file_contents){
    println(line)
    
}

println("Answer = ${answer}")
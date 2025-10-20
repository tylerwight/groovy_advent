List<String> file_contents = new File('./puzzleinput').readLines()

def answer = 0


for(line in file_contents){
    println(line)
    def muls = (line =~ /mul\((\d+),(\d+)\)/)
    
    muls.each { mul ->
        def a = mul[1] as int 
        def b = mul[2] as int
        println("A: ${a}  B: ${b}")
        answer = answer + (a * b)
    }
}

println("Answer = ${answer}")
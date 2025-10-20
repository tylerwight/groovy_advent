List<String> file_contents = new File('./puzzleinput').readLines()

def answer = 0
boolean enabled = true

def pattern = ~/(do\(\))|(don't\(\))|mul\((\d+),(\d+)\)/


for(line in file_contents){

    def matches = pattern.matcher(line)

    while (matches.find()){
        def working_string = matches.group(0)

        if (working_string == "do()"){
            enabled = true

        } else if (working_string == "don't()"){
            enabled = false
            
        } else if (enabled == true){
            def mul = (working_string =~ /mul\((\d+),(\d+)\)/)
            mul.find()
            println(mul.group(0))
            def a = mul.group(1) as int 
            def b = mul.group(2) as int
            println("A: ${a}  B: ${b}")
            answer = answer + (a *b)
        }
    }
    
}

println("Answer = ${answer}")
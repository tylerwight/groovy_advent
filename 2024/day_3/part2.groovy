List<String> file_contents = new File('./puzzleinput').readLines()

def answer = 0
boolean enabled = true

def pattern = ~/mul\((\d+),(\d+)\)/

for(line in file_contents){

    def muls = pattern.matcher(line)

    while (muls.find()){
        print(muls.group(0) + "\n\n")
    }
    
}

println("Answer = ${answer}")
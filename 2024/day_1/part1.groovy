List<String> file_contents = new File('./puzzleinput').readLines()
List<Integer> left_list = []
List<Integer> right_list = []


//populate left/right list
for(line in file_contents){
    def (left, right) = line.trim().split(/\s+/)
    left_list.add(left.toInteger())
    right_list.add(right.toInteger())
}


left_list.sort()
right_list.sort()

Integer answer = 0
for (i=0; i < left_list.size(); i++){
    println(left_list[i] + " " + right_list[i])
    def difference = Math.abs(left_list[i] - right_list[i])
    answer = answer + difference
}

println("Answer = " + answer)
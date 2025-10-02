List<String> file_contents = new File('./puzzleinput').readLines()
List<Integer> left_list = []
List<Integer> right_list = []


//populate left/right list
for(line in file_contents){
    def (left, right) = line.trim().split(/\s+/)
    left_list.add(left)
    right_list.add(right)
}


left_list.sort()
right_list.sort()
println(left_list)
println(right_list)


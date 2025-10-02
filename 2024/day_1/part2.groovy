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
left_list.each(){ left ->
    def right_count = 0

    right_list.each(){ right ->
        if (left < right){continue}
        if (left == right){
            right_count = right_count + 1
        }

    }
    answer = answer + (left * right_count)
}

println("Answer = " + answer)
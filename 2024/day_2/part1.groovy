List<String> file_contents = new File('./puzzleinput').readLines()
List<List<Integer>> line_list = []


//populate left/right list
for(line in file_contents){
    line_list.add(line.trim().split(/\s+/).collect { it.toInteger() })
    
}



boolean is_safe(List<Integer> row){
    boolean increasing = null

    for (int i = 1; i < row.size(); i++){
        def difference = row[i] - row[i-1]

        if (difference == 0 || Math.abs(difference) > 3){
                println("unsafe: diff = " + difference)
                return false
            }

        if (i == 1){
            increasing = difference > 0
        } else{
            if ((difference > 0) != increasing){
                println("unsafe: switched signs")
                return false
                }
        }
    }

    return true
}

def safe_reports = 0
line_list.each{row->
    println(row)
    if (is_safe(row)){
        println("safe")
        safe_reports = safe_reports + 1
    }

}

println("Answer (safe_reports) = " + safe_reports)
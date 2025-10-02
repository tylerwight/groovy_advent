List<String> file_contents = new File('./puzzleinput').readLines()
List<Integer> line_list = []


//populate left/right list
for(line in file_contents){
    line_list.add((line.trim().split(/\s+/)).toInteger())
    
}


// def safe_reports = 0
// line_list.each{row->
//     println(row)
//     def prev_level = row[0]
//     def row_safe = true
    
//     row.each{level->
//         if (Math.abs(level - prev_level) > 2){
//             row_safe = false
//             println("unsafe")
//             return
//         }
//     }
//     if (row_safe == true){
//         safe_reports = safe_reports + 1
//     }

// }

// println("Answer (safe_reports) = " + safe_reports)
List<String> file_contents = new File('./puzzleinput').readLines()


BigInteger answer = 0
Integer sign = 1



for(line in file_contents){
    println(line)
    int best = 0
    int maxLeft = -1   // best digit seen so far from the left

    line.each { ch ->
        int d = ch as int
        if (maxLeft >= 0) {
            best = Math.max(best, maxLeft * 10 + d)
        }
        maxLeft = Math.max(maxLeft, d)
    }
    println("   best: " + best)
    answer = answer + best



}

println("Answer: " + answer)
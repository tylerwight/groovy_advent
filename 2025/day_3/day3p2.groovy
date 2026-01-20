List<String> file_contents = new File('./puzzleinput').readLines()


BigInteger answer = 0
Integer sign = 1

def maxSubsequence = { line, k ->
    def stack = []
    int toRemove = line.size() - k 

    line.each { ch ->
        while (toRemove > 0 && stack && stack[-1] < ch) {
            stack.pop()
            toRemove--
        }
        stack << ch
    }

    stack.take(k).join()
}

for(line in file_contents){
    println(line)
    def best = maxSubsequence(line, 12) as BigInteger
    println("   best: " + best)

    answer = answer + best
}

println("Answer: " + answer)
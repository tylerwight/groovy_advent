List<String> file_contents = new File('./puzzleinput').readLines()


BigInteger answer = 0
Integer sign = 1

// match groups: (any number of digits in a row)-(any number of digits in a row)
def regex = ~/(\d+)-(\d+)/
def dup_num_regex = ~/\b(\d+)\1+\b/

for(line in file_contents){
    def groups = (line =~ regex)

    for (group in groups){
        println("\nGroup: " + group[0])
        BigInteger left = group[1] as BigInteger
        BigInteger right = group[2] as BigInteger
        
        for (i in left..right){
            def duplicate = (i =~ dup_num_regex)
            Integer num_digits = (int)(Math.log10(i) + 1)
            if (duplicate.getCount() > 0){
                println("\tregex match: " + duplicate[0][0])
                answer += i

            }
        }
    }


}

println("Answer: " + answer)
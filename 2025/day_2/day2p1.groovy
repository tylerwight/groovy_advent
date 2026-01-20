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

            if (duplicate.getCount() > 0 && num_digits % 2 == 0) {
                println("   reg matched: " + duplicate[0][0])
                Integer middle = (num_digits / 2)
                def numstring = i.toString()
                def half_1 = numstring.substring(0, middle)
                def half_2 = numstring.substring(middle)

                if (half_1 == half_2){
                    println("       used: " + i )
                    answer += i


                }


            
            }
        }
    }


}

println("Answer: " + answer)
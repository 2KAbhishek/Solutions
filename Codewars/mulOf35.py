from functools import reduce
def solution(number):
    threeMultiples = []
    fiveMultiples = []
    result = 0 # If passed number is 0
    n = 3 # Start from 3
    sum = lambda a,b : a + b # for use in reduce
    while n < number:
        if n % 3 == 0:
            threeMultiples.append(n)
        elif n % 5 == 0:
            fiveMultiples.append(n)
        n = n + 1

    finalList = threeMultiples + fiveMultiples

    if len(finalList)>0:
      result = reduce(sum, finalList)

    return(result)

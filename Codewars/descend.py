import functools
def descending_order(num):
    listNums = []
    
    for char in str(num):
        listNums.append(int(char))
  
    listNums.sort(reverse=True)
    product = lambda big, small: 10 * big + small
    result = functools.reduce(product, listNums, 0) 
    return(result)
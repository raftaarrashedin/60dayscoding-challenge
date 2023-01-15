#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'dynamicArrayhackerrank' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER n
#  2. 2D_INTEGER_ARRAY queries
#

def dynamicArray(n, queries):
    # Write your code here
    
    #Initialization
    seq = [[] for _ in range(n)]
    last_answer = 0
    result = []
    
    # main logic
    for q,x,y in queries :
        if q == 1 : 
            idx = (x ^ last_answer) % n
            seq[idx].append(y)
        else :
            idx = (x ^ last_answer) % n
            v = y % len(seq[idx])
            last_answer = seq[idx][v]
            result.append(last_answer)
            
            
            
    return result
            
    
    
    
    
    
    
    
    
    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    q = int(first_multiple_input[1])

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    result = dynamicArray(n, queries)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()

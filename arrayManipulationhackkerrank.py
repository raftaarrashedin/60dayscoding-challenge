#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'arrayManipulation' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. 2D_INTEGER_ARRAY queries
#
# 5 3
# 1 2 100
# 2 5 100
# 3 4 100
def arrayManipulation(n, queries):
    # Write your code here
    # Initialize the array with the zero
    arr = [0] * (n+2)
    
    # performing the queries operations
    
    for a,b,k in queries :
        arr[a] += k
        arr[b+1] -= k
        print(arr)
    maxnum = 0
    temp = 0
    for val in arr :
        temp += val
        maxnum = max(maxnum,temp)
        
    return maxnum
    
    
    
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    m = int(first_multiple_input[1])

    queries = []

    for _ in range(m):
        queries.append(list(map(int, input().rstrip().split())))

    result = arrayManipulation(n, queries)

    fptr.write(str(result) + '\n')

    fptr.close()

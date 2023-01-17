#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'minimumDistances' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#
# 6               arr[] size n = 6
# 7 1 3 4 1 7     arr = [7, 1, 3, 4, 1, 7]
def minimumDistances(a):
    # Write your code here
           
    m,d=-1,{}
    for i in range(len(a)):
        c=a[i]   
        if c in d :  
            f= i-d[c]
            m =f if m<0 or  f<m else m
        d[c] = i
        
    return m
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    result = minimumDistances(a)

    fptr.write(str(result) + '\n')

    fptr.close()

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'kaprekarNumbers' function below.
#
# The function accepts following parameters:
#  1. INTEGER p
#  2. INTEGER q
#

def kaprekarNumbers(p, q):
    # Write your code here
    
    nums = []
    for i in range(p,q+1) :
        d, sq = len(str(i)), str(i**2)
        if i == 1 or (len(str(i*i)) > d and i == int(sq[-d:]) + int(sq[:-d]) and int(sq[d:]) != 0) :
            nums.append(i)
    
    if len(nums) == 0:
        print('INVALID RANGE')
    else :
        print(*nums,end="")
    
    
    
if __name__ == '__main__':
    p = int(input().strip())

    q = int(input().strip())

    kaprekarNumbers(p, q)

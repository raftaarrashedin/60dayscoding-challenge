#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter
#
# Complete the 'gameOfThrones' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def gameOfThrones(s):
    # Write your code here
    a = Counter(s)
    odd = 0
    val = list(a.values())
    for v in val :
        if v % 2 == 0 :
            continue
        else :
            odd +=1
    
    if odd == 0 or odd == 1 :
        return 'YES'   
    else :
        return 'NO'        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = gameOfThrones(s)

    fptr.write(result + '\n')

    fptr.close()

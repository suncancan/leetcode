'''
算法：蓄水池问题
简介：要求从信息流中随机抽取k个元素
时间：20170830
'''

import sys
import random

if __name__=="__main__":
        ls=[]
        k=10
        i=1

        for line in sys.stdin:
                line=line.strip("\n")
                if i<11:
                        ls.append(line)
                else:
                        ran=random.uniform(0,1)
                        if ran<(k+0.00)/i:
                                ran2=random.randint(1,k)
                                ls[ran2-1]=line
                i=i+1

        for item in ls:
                print item

 
 
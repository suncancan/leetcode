'''
算法：编辑距离
简介：把字符串s转换成t最少需要多少步操作（增改删）
时间：20170831
'''

#coding:gb18030

if __name__=="__main__":
        s="abbb"
        t="bb"
        slen=len(s)+1
        tlen=len(t)+1

        dis=[]
        cos=1

        for i in range(slen):
                dis.append([])
                dis[i].append(i)

        for j in range(1,tlen):
                dis[0].append(j)

        for i in range(1,slen):
                for j in range(1,tlen):
                        cos=1
                        if s[i-1]==t[j-1]:
                                cos=0
                        dis[i].append(min(dis[i-1][j]+1,dis[i][j-1]+1,dis[i-1][j-1]+cos))

        print str(dis[slen-1][tlen-1])

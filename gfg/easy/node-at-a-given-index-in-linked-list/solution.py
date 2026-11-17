'''
class Node:
    def __init__(self, x):
        self.data = x
        self.next = None
'''


class Solution:

    def getNode(self, head: 'Node', k: int) -> int:
        """ code here """
        temp=head
        count=0
        while temp!=None:
            count+=1
            if(count==k):
                return temp.data
            temp=temp.next;
        return -1

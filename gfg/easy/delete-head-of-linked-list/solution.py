'''Structure of Linked List Node
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''

class Solution:
    def deleteHead(self, head):
        # code here
        if head==None:
            return None
        head=head.next
        return head
    
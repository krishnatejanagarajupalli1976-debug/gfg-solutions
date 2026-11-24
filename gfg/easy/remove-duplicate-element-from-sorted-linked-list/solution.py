"""
# Structure of linked list Node
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
"""

class Solution:
    def removeDuplicates(self, head):
        # code here
        temp=head;
        while(temp!=None and temp.next!=None):
            if temp.data == temp.next.data:
                temp.next=temp.next.next
            else:
                temp=temp.next
        return head
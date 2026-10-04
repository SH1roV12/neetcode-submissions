# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
        prev = None
        cur = slow
        while cur != None:
            curNext = cur.next
            cur.next = prev
            prev = cur
            cur = curNext
        pointer = head
        while pointer != slow:
            if pointer.val != prev.val:
                return False
            prev = prev.next
            pointer = pointer.next
        return True
package org.example.LeetCdePackage;

public class AddTwoNumber {
/*    Linked List Kya Hota Hai? (Hinglish mein)
    Simple bhasha mein: Ek linked list ek chain ki tarah hoti hai jahan har node (element) ke paas do cheezein hoti hain:

    Data — actual value
    Next pointer — agle node ka address

[2] → [4] → [3] → null
    Array ki tarah continuous memory nahi chahiye — nodes memory mein kahin bhi ho sakte hain, bas pointer se connected hote hain.
    Array vs Linked List (Interview mein poochha jaata hai!)
    FeatureArrayLinked ListMemoryContinuousScatteredAccessO(1) randomO(n) traversalInsert/DeleteO(n)O(1) at headSizeFixed (mostly)Dynamic
Java mein Node class:
    javaclass ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

🧩 Problem: Add Two Numbers
    Problem statement: Do linked lists diye gaye hain jo reverse order mein numbers represent karte hain. Unka sum return karo (phir se linked list mein).
    Input:
    l1 = [2 → 4 → 3]  →  represents  342
    l2 = [5 → 6 → 4]  →  represents  465

    Output:
            [7 → 0 → 8]        →  represents  807

            💡 Approach — Carry ke saath add karo (School wali addition!)
    Sochho jaise tum manually add karte ho:

    Units digit: 2 + 5 = 7 ✅
    Tens digit: 4 + 6 = 10 → 0 likhao, 1 carry karo
    Hundreds digit: 3 + 4 + 1(carry) = 8 ✅

    Yahi logic code mein lagaate hain!

    Dry Run (Example ke saath)
    l1: 2 → 4 → 3
    l2: 5 → 6 → 4
    carry = 0

    Step 1: sum = 0+2+5 = 7,  carry=0, digit=7  → node(7)
    Step 2: sum = 0+4+6 = 10, carry=1, digit=0  → node(0)
    Step 3: sum = 1+3+4 = 8,  carry=0, digit=8  → node(8)

    Result: 7 → 0 → 8  ✅ (= 807)

            ⏱️ Complexity
    ValueTimeO(max(m, n)) — dono lists ki max lengthSpaceO(max(m, n)) — result list ke liye

🎯 Interview Mein Kya Bolna Hai

"Main dummy head node use karunga" — edge cases easy ho jaate hain
"Carry handle karunga" — 9+9=18 jaisa case
            "Unequal length lists bhi handle hogi" — null check se
"End mein carry remaining ho sakta hai" — carry != 0 condition isliye hai*/
public static void main(String[] args) {
    AddTwoNumber sol = new AddTwoNumber();
   ListNode newValue = sol.addTwoNumbers(
            new ListNode(2, new ListNode(4, new ListNode(3))),
            new ListNode(5, new ListNode(6, new ListNode(4)))
    );
    System.out.println(newValue);
}
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode current = dummy;
        int carry =0;
        while(l1!=null || l2!=null || carry!=0){
            int sum = carry;
            if(l1!=null){
                sum+=l1.val;
                l1= l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry = sum/10;
            int digit = sum %10;
            current.next = new ListNode(digit);
            current = current.next;

        }

        return  dummy.next;
    }

}

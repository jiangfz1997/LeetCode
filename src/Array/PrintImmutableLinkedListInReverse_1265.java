package Array;

public class PrintImmutableLinkedListInReverse_1265 {
    class ImmutableListNode{
        public ImmutableListNode getNext(){
            return new ImmutableListNode();
        }
        public void printValue(){};
    }

        public void printLinkedListInReverse(ImmutableListNode head) {
            if(head.getNext() == null){
                head.printValue();
                return;
            }
            printLinkedListInReverse(head.getNext());
            head.printValue();
        }

}

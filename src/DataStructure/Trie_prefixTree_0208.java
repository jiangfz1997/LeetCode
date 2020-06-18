package DataStructure;

public class Trie_prefixTree_0208 {
    class Trie {
        private TrieNode root;
        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            for(int i = 0; i < word.length(); i++ ){
                char tmp = word.charAt(i);
                if(!node.containsKey(tmp)){
                    node.set(tmp, new TrieNode());
                }
                node = node.get(tmp);
            }
            node.setEnd();
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode node = root;
            for(int i = 0; i < word.length(); i++){
                char tmp = word.charAt(i);
                if(!node.containsKey(tmp)) return false;
                node = node.get(tmp);
            }
            return true && node.isEnd();
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for(int i = 0; i < prefix.length(); i++){
                char tmp = prefix.charAt(i);
                if(!node.containsKey(tmp)) return false;
                node = node.get(tmp);
            }
            return true ;
        }

        class TrieNode{
            private TrieNode[] list;
            private final int alpha = 26;
            private boolean isEnd;
            public TrieNode(){
                list = new TrieNode[alpha];
            }

            public boolean containsKey(char ch){
                return list[ch - 'a'] != null;
            }

            public void set(char ch, TrieNode node){
                this.list[ch - 'a'] = node;
            }

            public TrieNode get(char ch){
                return list[ch - 'a'];
            }

            public void setEnd(){
                isEnd = true;
            }

            public boolean isEnd(){
                return isEnd;
            }


        }
    }
}

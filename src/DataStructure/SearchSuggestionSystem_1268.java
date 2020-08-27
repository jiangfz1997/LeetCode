package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionSystem_1268 {
    class Solution {
        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            List<List<String>> list = new ArrayList<>();
            if (products == null || products.length == 0 || searchWord == null || searchWord.length() == 0) {
                return list;
            }
            Arrays.sort(products);
            Trie trie = new Trie();

            for(String s : products){
                trie.insert(s);
            }
            String type = "";
            // search suggestion for each character
            for (int i = 0; i < searchWord.length(); i++) {
                type += searchWord.charAt(i);
                list.add(trie.search(type));
            }
            return list;
        }

        class Trie{
            TrieNode root;
            public Trie() {
                this.root = new TrieNode();
            }

            public void insert(String words){
                TrieNode node = root;
                for(int i = 0; i< words.length(); i++){
                    char c = words.charAt(i);
                    if(node.cache[c - 'a'] == null) node.cache[c-'a'] = new TrieNode();
                    node = node.cache[c - 'a'];
                    if(node.list.size() < 3) node.list.add(words);
                }
            }
            public List<String> search(String word){
                TrieNode node = root;
                for(int i = 0; i < word.length(); i++){
                    char c = word.charAt(i);
                    if(node.cache[c - 'a'] == null) return new ArrayList<>();
                    node = node.cache[c - 'a'];
                }
                return node.list;
            }

            public class TrieNode{
                TrieNode[] cache;
                List<String> list;

                public TrieNode(){
                    this.cache = new TrieNode[26];
                    this.list = new ArrayList<>();
                }
            }
        }
    }
}

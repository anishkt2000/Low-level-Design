package LowLevelDesignQuestions.DesignDataStructure;


public class MyHashMap <K,V>{
    private static final int INITIAL_CAPACITY = 16;
    private static final int Maximum_CAPACITY = 1 << 30;
    public Entry[] hashTable;

    public MyHashMap(){
        hashTable =new Entry[INITIAL_CAPACITY];
    }

    public MyHashMap(int capacity){
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];

    }

    final  int tableSizeFor(int cap){
        // if cap is already a power of 2, then return cap
        // else return the next power of 2
        // eg: cap = 20, return 32
        int n =cap-1;
        n |= n >>> 1;
        n |= n >>>2;
        n |= n>>>4;
        n |= n>>>8;
        n |= n >>>16;

        return (n < 0) ? 1 : (n >= Maximum_CAPACITY) ? Maximum_CAPACITY : n + 1;
    }

    class Entry<K,V>{
        K key;
        V value;
        Entry<K,V> next;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public void put(K key, V value){
        int hashCode= key.hashCode()% hashTable.length;
        Entry node = hashTable[hashCode];
        if(node ==null){
            Entry newNode =new Entry(key,value);
            hashTable[hashCode]=newNode;
        }
        else{
            while (node !=null){
                if(node.key.equals(key)){
                    node.value=value;
                    return;
                }
                node =node.next;
            }
            Entry newNode =new Entry(key,value);
            node.next=newNode;
        }
    }

    public V get(K key){
        int hashCode= key.hashCode()% hashTable.length;
        Entry node = hashTable[hashCode];
        while (node !=null){
            if(node.key.equals(key)){
                return (V)node.value;
            }
            else{
                node =node.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap <Integer,String> myHashMap =new MyHashMap<>();
        myHashMap.put(1,"One");
        myHashMap.put(2,"Two");
        myHashMap.put(3,"Three");
        myHashMap.put(2,"twow");
        System.out.println(myHashMap.get(2));
    }
}

// what is contract between equals and hashcode
// if two objects are equal then their hashcode must be same
// if two objects have same hashcode then they may or may not be equal
// if two objects are not equal then their hashcode may or may not be same


// load factor =0.75;
// threshold = capacity * load factor
// when size > threshold then rehashing is done
// rehashing = create a new array of double size and copy all elements to new array


// treeify = when number of elements in a bucket is more than 8 then convert linked list to balanced tree
// untreeify = when number of elements in a bucket is less than 6 then convert balanced tree to linked list
// minimum capacity for treeify is 64
Implement a document scanning function wordCountEngine, which receives a string document and returns a list of all unique words in it and their number of occurrences, sorted by the number of occurrences in a descending order. If two or more words have the same count, they should be sorted according to their order in the original sentence. Assume that all letters are in english alphabet. You function should be case-insensitive, so for instance, the words “Perfect” and “perfect” should be considered the same word.

The engine should strip out punctuation (even in the middle of a word) and use whitespaces to separate words.

Analyze the time and space complexities of your solution. Try to optimize for time while keeping a polynomial space complexity.

Examples:

input:  document = "Practice makes perfect. you'll only
                    get Perfect by practice. just practice!"

output: [ ["practice", "3"], ["perfect", "2"],
          ["makes", "1"], ["youll", "1"], ["only", "1"], 
          ["get", "1"], ["by", "1"], ["just", "1"] ]



static String[][] wordCountEngine(String document) {
    // your code goes here
    String [] words = document.split("\\s+");
        String [] parse = new String[words.length];
        int i=0;
        for (String str : words) {
            String clean = str.replaceAll("[^a-zA-z]", "");
            clean = clean.toLowerCase();
            parse[i++] = clean;
            //System.out.println(clean);
        }
        
        LinkedHashMap<String,Integer> hmap = new LinkedHashMap<String,Integer>();
        int maxCount = 0;
        for(String str : parse)
        {
            if(hmap.containsKey(str))
            {
                hmap. put(str, hmap.get(str)+1);
            }
            else{
                hmap. put(str, 1);
            } 
            //maxCount = Math.max(maxCount, hmap.get(str));
        }
    /*
        for(String k : hmap.keySet())
        {
            System.out.println(k+ " " + hmap.get(k));
        }
        System.out.println(maxCount);
        
        */
        String[][] out = new String[hmap.size()][2];
        
        Set <String> keys = new HashSet<>();
        keys.addAll(hmap.keySet());
    
        Collections.sort(keys, (k1, k2) -> (hmap.get(k2) - hmap.get(k1)));     
        
        int x=0;
        for(String k : hmap.keySet())
        {
            out[x][0] = k;
            out[x][1] = hmap.get(k).toString();
            x++;
        }            

        return out;
  }

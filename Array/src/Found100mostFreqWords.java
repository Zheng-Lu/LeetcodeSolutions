import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Found100mostFreqWords {

    public static List<String> mostnFrequent(ArrayList<String> words, int k) {
        Map<String, Integer> count = new HashMap();
        for (String word: words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<String> candidates = new ArrayList(count.keySet());
        candidates.sort((w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                w1.compareTo(w2) : count.get(w2) - count.get(w1));

        return candidates.subList(0, k);
    }

    public static void main(String[] args) throws Exception {
        String line;
        ArrayList<String> words = new ArrayList<>();

        FileReader file = new FileReader("C:\\Users\\Lenovo\\Desktop\\data.txt");
        BufferedReader br = new BufferedReader(file);

        //遍历每行
        while((line = br.readLine()) != null) {
            //把每行句子一个个的分成单个单词放入名为string的数组
            String[] string = line.toLowerCase().split("\\s+");
            //添加遍历到的单词
            Collections.addAll(words, string);
        }


        System.out.println("出现次数最多的100个单词：");

        for (String w : mostnFrequent(words,100)){
            System.out.println(w);
        }
    }
}

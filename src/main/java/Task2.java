import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task2 {

  public List<Entry<String, Integer>> topFive(String[] list) {
    if (list == null || list.length == 0) {
      return null;
    }
    Map<String, Integer> hashtag = new HashMap();
    Pattern pattern = Pattern.compile("#[A-za-z]+");

    String temp;

    for (int i = 0; i < list.length; i++) {
      Matcher matcher = pattern.matcher(list[i]);
      Set<String> uniqueHashtags = new HashSet<>();
      while (matcher.find()) {
        temp = (list[i].substring(matcher.start(), matcher.end())).toLowerCase();
        if (uniqueHashtags.contains(temp)) {
          continue;
        }
        if (hashtag.containsKey(temp)) {
          hashtag.put(temp, hashtag.get(temp) + 1);
        } else {
          hashtag.put(temp, 1);
        }
        uniqueHashtags.add(temp);

      }
    }

    List<Entry<String, Integer>> returned = hashtag.entrySet().stream()
        .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
        .collect(Collectors.toList());
    return returned.subList(0, Math.min(returned.size(), 5));
  }
}

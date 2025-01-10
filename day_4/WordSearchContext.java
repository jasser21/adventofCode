import java.util.ArrayList;
import java.util.List;

public class WordSearchContext {
    public PartTwoStrategy pt = new PartTwoStrategy();
    public List<SearchStrategy> searchStrategies = new ArrayList<SearchStrategy>();

    public WordSearchContext() {
        searchStrategies.add(pt);
    }

    public void addStrategy(SearchStrategy S) {
        searchStrategies.add(S);
    }

    public Integer SearchWord(Integer[] X_position) {
        int wordCount = 0;
        for (SearchStrategy searchStrategy : searchStrategies) {
            searchStrategy.Search(X_position);
        }
        return wordCount;
    }
}

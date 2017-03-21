package lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class EventContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<EventItem> ITEMS = new ArrayList<EventItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, EventItem> ITEM_MAP = new HashMap<String, EventItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createEventItem(i, "sample", 4, R.drawable.ic_octocat));
        }
    }

    private static void addItem(EventItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.name, item);
    }

    private static EventItem createEventItem(int position, String details, int score, int photoId) {
        return new EventItem(String.valueOf(position), details, score, photoId);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class EventItem {
        public final String name;
        public final String details;
        public final int score;
        public final int photoId;


        public EventItem(String name, String details, int score, int photoId) {
            this.name = name;
            this.details = details;
            this.score = score;
            this.photoId = photoId;
        }

        @Override
        public String toString() {
            return details;
        }
    }
}

package com.example.whiteboard.services;
import com.example.whiteboard.models.Widget;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class WidgetService {
    private HashMap<String, List<Widget>> topicWidgetMap;

    public WidgetService() {
        topicWidgetMap = new HashMap<>();
    }

    public Widget createWidget(String tid, Widget widget) {
        String id = (new Date()).getTime() + "";
        widget.setId(id);
        if (!topicWidgetMap.containsKey(tid)) {
            topicWidgetMap.put(tid, new ArrayList<>());
        }
        topicWidgetMap.get(tid).add(widget);
        return widget;
    }

    public List<Widget> findWidgetsForTopic(String tid) {
        return topicWidgetMap.get(tid);
    }

    public int updateWidget(String wid, Widget widget) {
        for (List<Widget> wList : topicWidgetMap.values()) {
            for (Widget w : wList) {
                if (w.getId().equals(wid)) {
                    w = widget;
                    return 1;
                }
            }
        }
        return 0;
    }

    public int deleteWidget(String wid) {
        for (List<Widget> wList : topicWidgetMap.values()) {
            for (Widget w : wList) {
                if (w.getId().equals(wid)) {
                    wList.remove(w);
                    return 1;
                }
            }
        }
        return 0;
    }
}

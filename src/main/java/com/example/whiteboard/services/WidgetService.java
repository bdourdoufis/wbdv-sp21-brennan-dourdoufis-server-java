package com.example.whiteboard.services;
import com.example.whiteboard.models.Widget;
import com.example.whiteboard.repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;

@Service
public class WidgetService {

    @Autowired
    private WidgetRepository repository;

    public WidgetService() {}

    public Widget createWidget(String tid, Widget widget) {
        widget.setTopicId(tid);
        return repository.save(widget);
    }

    public List<Widget> findWidgetsForTopic(String tid) {
        return repository.findWidgetsForTopic(tid);
    }

    public int updateWidget(int wid, Widget widget) {
        Widget originalWidget = repository.findById(wid).get();

        originalWidget.setName(widget.getName());
        originalWidget.setType(widget.getType());
        originalWidget.setWidgetOrder(widget.getWidgetOrder());
        originalWidget.setText(widget.getText());
        originalWidget.setUrl(widget.getUrl());
        originalWidget.setSize(widget.getSize());
        originalWidget.setWidth(widget.getWidth());
        originalWidget.setHeight(widget.getHeight());
        originalWidget.setCssClass(widget.getCssClass());
        originalWidget.setStyle(widget.getStyle());
        originalWidget.setValue(widget.getValue());
        originalWidget.setOrdered(widget.isOrdered());

        repository.save(originalWidget);
        return 1;
    }

    public int deleteWidget(int wid) {
        repository.deleteById(wid);
        return 1;
    }
}

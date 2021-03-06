package com.example.whiteboard.controller;

import com.example.whiteboard.models.Widget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.whiteboard.services.WidgetService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {
    @Autowired
    WidgetService service;

    @PostMapping("/api/topics/{tid}/widgets")
    public Widget createWidget(
            @PathVariable("tid") String tid,
            @RequestBody Widget widget) {
        return service.createWidget(tid, widget);
    }

    @GetMapping("/api/topics/{tid}/widgets")
    public List<Widget> findWidgetsForTopic(
            @PathVariable("tid") String tid) {
        return service.findWidgetsForTopic(tid);
    }

    @PutMapping("/api/widgets/{wid}")
    public int updateWidget(
            @PathVariable("wid") String wid,
            @RequestBody Widget widget) {
        return service.updateWidget(wid, widget);
    }

    @DeleteMapping("/api/widgets/{wid}")
    public int deleteWidget(
            @PathVariable("wid") String wid) {
        return service.deleteWidget(wid);
    }
}

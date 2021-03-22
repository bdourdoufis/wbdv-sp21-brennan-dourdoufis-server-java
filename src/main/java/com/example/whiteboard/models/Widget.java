package com.example.whiteboard.models;

public class Widget {
    private String name;
    private String id;
    private String type;
    private int widgetOrder;
    private String text;
    private String url;
    private int size;
    private int width;
    private int height;
    private String cssClass;
    private String style;
    private String value;

    public Widget() {}

    public Widget(Widget other) {
        this.name = other.getName();
        this.id = other.getId();
        this.type = other.getType();
        this.widgetOrder = other.getWidgetOrder();
        this.text = other.getText();
        this.url = other.getUrl();
        this.size = other.getSize();
        this.width = other.getWidth();
        this.height = other.getHeight();
        this.cssClass = other.getCssClass();
        this.style = other.getStyle();
        this.value = other.getValue();
    }

    public Widget(String name, String id, String type, int widgetOrder, String text, String url, int size, int width,
                  int height, String cssClass, String style, String value) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.widgetOrder = widgetOrder;
        this.text = text;
        this.url = url;
        this.size = size;
        this.width = width;
        this.height = height;
        this.cssClass = cssClass;
        this.style = style;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidgetOrder() {
        return widgetOrder;
    }

    public void setWidgetOrder(int widgetOrder) {
        this.widgetOrder = widgetOrder;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

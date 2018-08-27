package com.performancelab.www.rest.model.response.baseResponse;

import java.util.ArrayList;
import java.util.List;

public class BaseItemResponse <T> {
    public String title;
    public List<T> items = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public List<T> getItems() {
        return items;
    }
}
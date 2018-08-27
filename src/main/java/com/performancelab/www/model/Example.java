package com.performancelab.www.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("items")
    @Expose
    public List<Item> items = null;
    @SerializedName("has_more")
    @Expose
    public Boolean hasMore;
    @SerializedName("quota_max")
    @Expose
    public Integer quotaMax;
    @SerializedName("quota_remaining")
    @Expose
    public Integer quotaRemaining;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
    }

    public Integer getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(Integer quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    @Override
    public String toString() {
        return "Example{" +
                "items=" + items +
                ", hasMore=" + hasMore +
                ", quotaMax=" + quotaMax +
                ", quotaRemaining=" + quotaRemaining +
                '}';
    }
}

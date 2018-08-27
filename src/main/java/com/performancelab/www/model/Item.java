package com.performancelab.www.model;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("tags")
    @Expose
    public List<String> tags = null;
    @SerializedName("owner")
    @Expose
    public Owner owner;
    @SerializedName("is_answered")
    @Expose
    public Boolean isAnswered;
    @SerializedName("view_count")
    @Expose
    public Integer viewCount;
    @SerializedName("answer_count")
    @Expose
    public Integer answerCount;
    @SerializedName("score")
    @Expose
    public Integer score;
    @SerializedName("last_activity_date")
    @Expose
    public Integer lastActivityDate;
    @SerializedName("creation_date")
    @Expose
    public Integer creationDate;
    @SerializedName("question_id")
    @Expose
    public Integer questionId;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("last_edit_date")
    @Expose
    public Integer lastEditDate;
    @SerializedName("accepted_answer_id")
    @Expose
    public Integer acceptedAnswerId;
    @SerializedName("closed_date")
    @Expose
    public Integer closedDate;
    @SerializedName("closed_reason")
    @Expose
    public String closedReason;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getAnswered() {
        return isAnswered;
    }

    public void setAnswered(Boolean answered) {
        isAnswered = answered;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public Integer getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    public void setAcceptedAnswerId(Integer acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    public Integer getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Integer closedDate) {
        this.closedDate = closedDate;
    }

    public String getClosedReason() {
        return closedReason;
    }

    public void setClosedReason(String closedReason) {
        this.closedReason = closedReason;
    }

    @Override
    public String toString() {
        return "Item{" +
                "tags=" + tags +
                ", owner=" + owner +
                ", isAnswered=" + isAnswered +
                ", viewCount=" + viewCount +
                ", answerCount=" + answerCount +
                ", score=" + score +
                ", lastActivityDate=" + lastActivityDate +
                ", creationDate=" + creationDate +
                ", questionId=" + questionId +
                ", link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", lastEditDate=" + lastEditDate +
                ", acceptedAnswerId=" + acceptedAnswerId +
                ", closedDate=" + closedDate +
                ", closedReason='" + closedReason + '\'' +
                '}';
    }
}
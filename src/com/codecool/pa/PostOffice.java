package com.codecool.pa;

import com.codecool.pa.postoffice.types.PostItem;
import com.codecool.pa.postoffice.types.PostItemType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PostOffice {
    private final List<PostItem> postItems = new ArrayList<>();

    public void addPostItem(PostItem postItem) {
        postItems.add(postItem);
    }

    public List<PostItem> getPostItemsByDate(LocalDate date) {
        return postItems.stream()
                .filter(postItem -> postItem.getPostedDate().equals(date))
                .collect(Collectors.toList());
    }

    public double calculateIncomeByType(PostItemType postItemType) {
        return postItems.stream()
                .filter(postItem -> postItem.getType() == postItemType)
                .map(PostItem::getPrice)
                .reduce(0.00, Double::sum);
    }
}

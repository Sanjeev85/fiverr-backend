package fiver.fireclone.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "gigs")
public class Gig {
    @Id
    private String id;
    private String userId;
    private String title;
    private String desc;
    private int totalStars;
    private int starNumber;
    private String cat;
    private double price;
    private String cover;
    private List<String> images;
    private String shortTitle;
    private String shortDesc;
    private int deliveryTime;
    private int revisionNumber;
    private List<String> features;
    private int sales;
    @CreatedDate
    private Instant createdAt;
    @LastModifiedDate
    private Instant updatedAt;

    // Getters and setters

    // You can define constructors, custom methods, and other fields as needed.
}

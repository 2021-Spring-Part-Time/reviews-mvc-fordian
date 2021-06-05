package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;

@Repository
public class ReviewRepository {


    Map<Long, Review> reviewMap = new HashMap<>();

    public ReviewRepository() {
        Review reviewOne = new Review(1L, "Flower", "/images/movieReview-movie1.jpg", "A really nice flower", "A flower field.");
        Review reviewTwo = new Review(2L,"A really nice controller","/images/reviewItem2.jpg","Controller","Will most likely have a small sticky tab for the trigger that will move slightly after a hot day and will stick with every pull.");
        Review reviewThree = new Review(3L,"Charge-cord","/images/reviewItem3.jpg","Charge cord","These cords will fall apart the first change they get. Not recommended.");
        Review reviewFour = new Review(4L,"Holiday-Sprite","/images/reviewItem4.jpg","Holiday Drink","The best drink you'll ever try. Recommended for Holiday Cheer !");

        reviewMap.put(reviewOne.getId(), reviewOne);
        reviewMap.put(reviewTwo.getId(), reviewTwo);
        reviewMap.put(reviewThree.getId(), reviewThree);
        reviewMap.put(reviewFour.getId(), reviewFour);
    }

    public ReviewRepository(Review ...reviewToAdd) {
        for (Review review : reviewToAdd) {
            reviewMap.put(review.getId(), review);
        }
    }
        public Review findOne ( long id){
            return reviewMap.get(id);
        }
        public Collection<Review> findAll() {
        return reviewMap.values();
        }


}
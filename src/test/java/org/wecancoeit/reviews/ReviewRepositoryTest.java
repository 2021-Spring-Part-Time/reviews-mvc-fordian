package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReviewRepositoryTest {
        private ReviewRepository underTest;
        private Review reviewOne = new Review(1L, "star-wars", "url", "space-cowboys", "blasters-sabers");
        private Review reviewTwo = new Review(2L,"star-wars2","url","space-cowboys2","blasters-sabers2");
    @Test
    public void shouldFindOneReview() {
         underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(foundReview, reviewOne);
    }
    @Test
    public void shouldFindAllReviews() {
        underTest = new ReviewRepository(reviewOne,reviewTwo);
        Collection<Review> foundReview = underTest.findAll();
        assertThat(foundReview).contains(reviewOne,reviewTwo);

    }


    }

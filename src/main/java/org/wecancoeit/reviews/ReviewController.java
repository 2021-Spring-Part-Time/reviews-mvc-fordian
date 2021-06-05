package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;


@Controller
public class ReviewController {

    @Resource
     private ReviewRepository reviewRepository;


    @RequestMapping("/reviews")
    public String findAllReviews(Model model) {
        model.addAttribute("reviewsModel", reviewRepository.findAll());
        return "ReviewsTemplate";
    }
    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value="id") Long id, Model model) throws ReviewNotFoundException {

        if(reviewRepository.findOne(id) == null) {
            throw new ReviewNotFoundException(); }

       model.addAttribute("reviewModel",reviewRepository.findOne(id));
        return "ReviewTemplate";
    }
}
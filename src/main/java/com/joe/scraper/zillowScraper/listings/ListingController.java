package com.joe.scraper.zillowScraper.listings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ListingController {

    @Autowired
    private ListingService listingService;

    @RequestMapping("/listings")
    private List<Listing> getAllListings() {
        return listingService.getAllListings();
    }

    @RequestMapping("/listings/{id}")
    private ResponseEntity<Optional<Listing>> getSeriesById(@PathVariable int id) {
        Optional<Listing> listing = listingService.getListing(id);

        if (listing.isPresent()) {
            return ResponseEntity.status(200).body(listing);
        }

        return ResponseEntity.status(204).body(listing);
    }

}

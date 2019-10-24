package com.joe.scraper.zillowScraper.listings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listingRepository;

    public List<Listing> getAllListings() {
        List<Listing> listings = new ArrayList<>();
        listingRepository.findAll().forEach(listings::add);
        System.out.println(listings);
        return listings;
    }

    public Optional<Listing> getListing(int id) {
        return listingRepository.findById(id);
    }
}

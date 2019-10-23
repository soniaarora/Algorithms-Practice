package com.genospace.search.controller;

import java.util.ArrayList;
import java.util.List;

import com.genospace.search.model.Drug;
import com.genospace.search.model.Search;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SearchController {
        @RequestMapping(method = RequestMethod.GET,value = "/search")
        public Search search(@RequestParam(value = "query") String query){

                Search search = new Search();
                Drug drug = new Drug();
                drug.setId(123);
                drug.setMainName("sonia");
                List<Drug> drugList = new ArrayList<>();
                drugList.add(drug);
                search.setDrugs(drugList);
                search.setMechanisms(new ArrayList<>());
                return search;
        }



}

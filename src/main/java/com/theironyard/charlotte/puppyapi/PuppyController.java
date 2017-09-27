package com.theironyard.charlotte.puppyapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PuppyController {
    List<Puppy> puppies = new ArrayList<>();

    @RequestMapping(path = "/puppies", method = RequestMethod.GET)
    public List<Puppy> getPuppies() {
//        Puppy p = new Puppy(110, 50, 8, 1, true, "St. Bernard", "Washburne");
//        Puppy p2 = new Puppy(100, 25, 4, 400, true, "German Shepherd/Lab Mix", "Roo");

//        puppies.add(p);
//        puppies.add(p2);

        return puppies;
    }

    @RequestMapping(path = "/puppies", method = RequestMethod.POST)
    public void addPuppy(@RequestBody Puppy p) {
        puppies.add(p);
    }

    @RequestMapping(path = "/rescue/{index}", method = RequestMethod.PATCH)
    public Puppy claimPuppy(@PathVariable("index") int puppyDex) {
        Puppy p = null;

        if (puppies.size() > 0) {
            p = puppies.get(puppyDex);

            puppies.remove(puppyDex);
        }

        return p;
    }
}

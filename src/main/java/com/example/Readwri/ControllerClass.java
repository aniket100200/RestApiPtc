package com.example.Readwri;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/travel")
public class ControllerClass
{
    //le'ts make the object of the Service class.
    @Autowired
    private ServiceClass serviceClassObj;
    @PostMapping("/addTravelItem")
    public String addTravelItem(@RequestBody TravelList travelList)
    {
        String ans=serviceClassObj.addTraveItem((travelList));
        return ans;
    }

    @GetMapping("/getTravelPlacesesList")
    public List<String> getTravelList(@RequestParam("userId") Integer userId)
    {
        List<String> ans=serviceClassObj.getTravelList(userId);
        return ans;
    }
}

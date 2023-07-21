package com.example.Readwri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServiceClass
{
    @Autowired
    private RepositoryClass repositoryClassObject;
    public String addTraveItem(TravelList travelList)
    {
        String ans=repositoryClassObject.addTravelItem(travelList);
        return ans;
    }


    public List<String> getTravelList(Integer userId)
    {
        List<TravelList>list=repositoryClassObject.getTraveList(userId);
        List<String>placesToVisit=new ArrayList<>();
        for(TravelList item:list)
        {
            placesToVisit.add(item.getPlaceName());
        }

        return placesToVisit;
    }
}

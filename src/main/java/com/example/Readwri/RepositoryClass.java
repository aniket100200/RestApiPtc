package com.example.Readwri;
import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryClass
{
    Map<Integer,List<TravelList>>travelListHashMap=new HashMap<>();

    public String addTravelItem(TravelList item)
    {
        int primaryKey=item.getUserId();
        List<TravelList>list=travelListHashMap.getOrDefault(primaryKey,new ArrayList<>());

        travelListHashMap.put(primaryKey,list);

        return "The travelItem with userId "+primaryKey+" has been added to Database!..";
    }

    public List<TravelList> getTraveList(Integer userId)
    {
        return travelListHashMap.getOrDefault(userId,new ArrayList<>());
    }

}

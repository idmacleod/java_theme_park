import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> result = new ArrayList<IReviewed>();
        result.addAll(attractions);
        result.addAll(stalls);
        return result;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addToVisited(attraction);
    }

    public HashMap<String, Integer> getAllReviews() {
        HashMap<String, Integer> allReviews = new HashMap<String, Integer>();
        for (IReviewed reviewed : getAllReviewed()) {
            allReviews.put(reviewed.getName(), reviewed.getRating());
        }
        return allReviews;
    }
}

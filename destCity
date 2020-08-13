class Solution {
    public String destCity(List<List<String>> paths) {
        String start = null;
        HashMap<String,String> route = new HashMap<>();
        for(List<String> place :paths){
            route.put(place.get(0),place.get(1));

                start = place.get(0);
            }
        }
        
        while(route.get(start) != null){
            start = route.get(start);
        }
        
        return start;
    }
}

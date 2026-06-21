class TimeMap {
    private Map<String,Map<Integer,String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)) {
            Map<Integer,String> timeMap = map.get(key);
            timeMap.put(timestamp,value);
        }else{
            Map<Integer,String> newMap = new HashMap<>();
             newMap.put(timestamp,value);
             map.put(key,newMap);
        }
    }
    

    public String get(String key, int time) {
          if (!map.containsKey(key)) return "";

    Map<Integer, String> timeMap = map.get(key);

    int[] arr = timeMap.keySet()
            .stream()
            .mapToInt(Integer::intValue)
            .toArray();

    Arrays.sort(arr); 

    int low = 0, high = arr.length - 1;
    int ans = -1;

    while (low <= high) {

        int mid = low + (high - low) / 2;

        if (arr[mid] == time) {
            return timeMap.get(arr[mid]);
        }

        if (arr[mid] < time) {
            ans = mid;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return ans == -1 ? "" : timeMap.get(arr[ans]);
    }
}

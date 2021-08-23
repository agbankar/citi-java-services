package com.programs;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoEventRecorderDiscovery {
    private Map<LocalTime, String> eventMap = null;

    public VideoEventRecorderDiscovery() {
        eventMap = new HashMap<>();
    }

    public void recordEvent(LocalTime recordedTime, String eventName) {
        eventMap.put(recordedTime, eventName);

    }

    public List<String> getRecordingSummary() {
        List<String> eventList = new ArrayList();
        //check with the help of timer
        LocalTime now = LocalTime.now();
        for (int i = 1; i < 600; i++) {
            LocalTime localTime = now.minusSeconds(i);
            String s = eventMap.get(localTime);
            if (s != null) {
                eventList.add(s);
            }
        }
        return eventList;


    }

    public static void main(String[] args) throws InterruptedException {
        VideoEventRecorderDiscovery recorder = new VideoEventRecorderDiscovery();
        //put the data

        LocalTime now = LocalTime.now();
        for (int i = 1; i < 21; i++) {
            recorder.eventMap.put(now.plusSeconds(i), "Event" + i);
        }
        //recorder.eventMap.entrySet().stream().forEach(System.out::println);
      //  System.out.println("size = " + recorder.eventMap.size());
        List<String> recordingSummary = recorder.getRecordingSummary();
        recordingSummary.stream().forEach(System.out::println);
        System.out.println("recordingSummary.size() = " + recordingSummary.size());


    }

}

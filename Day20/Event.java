package Day20;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


public class Event {
    String eventName;
    LocalDateTime dateTime;
    Duration duration;
    Event(String eventName,LocalDateTime dateTime,Duration duration)
    {
    this.eventName = eventName;
    this.dateTime = dateTime;
    this.duration = duration;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", dateTime=" + dateTime +
                ", duration=" + duration.toMinutes() + " minutes" +
                '}';
    }

    public static void main(String[] args) {
        List<Event> events = List.of(
                new Event("Morning Meeting", LocalDateTime.of(2025, 1, 28, 9, 0), Duration.ofMinutes(30)),
                new Event("Lunch Break", LocalDateTime.of(2025, 1, 28, 12, 0), Duration.ofHours(1)),
                new Event("Workshop", LocalDateTime.of(2025, 1, 29, 15, 0), Duration.ofHours(2))
        );

        System.out.println("All events: ");
        display(events);

        LocalDate filterDate = LocalDate.of(2025,1,28);
        System.out.println("Events on: "+filterDate);
        List<Event> filterEvents = filterEventByDate(events,filterDate);
        display(filterEvents);

        System.out.println("Duration ");
       calculateDuration(events);

    }
    public static void display(List<Event> events)
    {
        events.forEach(System.out::println);
    }
    public static List<Event> filterEventByDate(List<Event> events,LocalDate filterDate)
    {
        return events.stream()
                .filter(event -> event.getDateTime().toLocalDate().equals(filterDate))
                .collect(Collectors.toList());
    }
    public static void calculateDuration(List<Event> events) {
        for (int i = 0; i < events.size() - 1; i++) {
            Event first = events.get(i);
            Event second = events.get(i + 1);
            Duration durationBetween = Duration.between(first.getDateTime(), second.getDateTime());
            System.out.println("Duration between '" + first.getEventName() + "' and '" + second.getEventName() + "': "
                    + durationBetween.toHours() + " hours and " + (durationBetween.toMinutes() % 60) + " minutes");
        }
    }
}

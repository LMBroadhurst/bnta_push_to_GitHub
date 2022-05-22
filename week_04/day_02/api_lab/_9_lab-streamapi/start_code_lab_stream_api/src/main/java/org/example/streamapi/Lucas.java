package org.example.streamapi;

public class Lucas {
    import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

    public class Main {
        public static void main(String[] args) {

        }

        private Predicate<Friend> isPartyReadyFromLambda = f -> f.getActivity().equals("Party");

        private Predicate<Friend> isPartyReadyFromClassImplementation = new IsPartReadyClassImplementation();

        public List<String> partyWithFriends(List<Friend> friends
        ) {
            return friends.stream()
                    .filter(f -> f.getActivity().equals("Party"))
//                .filter(isPartyReadyFromLambda)
//                .filter(isPartyReadyFromClassImplementation)
//                .filter(Friend.isAvailableOnSaturday)
                    .map(f -> f.getName())
                    .toList();
        }
    }

    class IsPartReadyClassImplementation implements Predicate<Friend> {

        @Override
        public boolean test(Friend friend) {
            return friend.getActivity().equals("Party");
        }
    }



    class Friend {
        static  Predicate<Friend> isAvailableOnSaturday = f -> f.getAvailableDay().equals("Saturday");
        private String name;
        private String availableDay;
        private String activity;

        public String getName() {
            return name;
        }

        public String getAvailableDay() {
            return availableDay;
        }

        public String getActivity() {
            return activity;
        }

        public Friend(String name, String availableDay, String activity) {
            this.name = name;
            this.availableDay = availableDay;
            this.activity = activity;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Friend friend = (Friend) o;
            return Objects.equals(name, friend.name) && Objects.equals(availableDay, friend.availableDay) && Objects.equals(activity, friend.activity);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, availableDay, activity);
        }
    }
}

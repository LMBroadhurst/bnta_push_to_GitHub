package org.example.streamapi;

import org.example.streamapi.model.Bodybuilder;
import org.example.streamapi.model.Friend;
import org.example.streamapi.model.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Extension {
    /*
        Given two int numbers a and b, return int [] with values that are in the range between smaller and bigger arg:
        - use IntStream.range
        - swap the argument's values without introducing a new, local variable.
    */
    public int [] streamNumbers(int a, int b) {

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        return IntStream.range(a, b)
                .toArray();
    }

    /*
        Given a list of users, return a User with the given user id. If there is no user with this id,
        return new user with the name "New user", given id, gender "unknown".

        (use Optional API)
    */
    public User getUserByIdOrCreateNew(List<User> users, long userId) {

        return users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(new User(userId, "New user", User.GENDER.UNKNOWN));
    }





    /*
        Given List<Friend>, filter the ones who are available on Saturday and want to party:
        - getAvailableDay returns "Saturday" and
        - getActivity returns "Party"
        - define predicates and use '.and' method.
    */

    public List<String> partyWithFriends(List<Friend> friends) {

        return null;

    }







    /*
        Return names of sorted bodybuilders.

        Sort List<Bodybuilder> using your custom comparator.

        Write a comparator for type BodyBuilder that will sort bodybuilders by:
        - who can lift more,
        - then who is younger,
        - then name alphabetically.
     */

    private Comparator<Bodybuilder> builderByNameLiftAge =
            Comparator.comparingInt(Bodybuilder::getLift).reversed()
                    .thenComparingInt(Bodybuilder::getAge)
                    .thenComparing(Bodybuilder::getName);

    public List<String> sortBodybuilders(List<Bodybuilder> bodybuilders) {
        return bodybuilders.stream()
                .sorted(builderByNameLiftAge)
                .map(Bodybuilder::getName)
                .toList();
//        return null;
    }

}

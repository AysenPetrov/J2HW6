package J2HW3;

import java.util.HashMap;

    public class Homework3 {

        public static void main(String[] args) {


            String[][] phonesData = {
                    {"Petrov","89222451939"},
                    {"Sidorov","89223439021"},
                    {"Ivanov","89221783489"},
                    {"Ivanov","89229511581"},
                    {"Pushkin","8128127721"},
                    {"Petrov","4952941555"},
                    {"Uvarov","4953019243"},
                    {"Fedorov","8129178142"},
            };

            PhoneBook pb = new PhoneBook();

            for(String[] record : phonesData) {
                pb.add(record[0], record[1]);
            }

            System.out.println("Search results:");
            System.out.println("Ivanov: " + pb.get("Ivanov"));
            System.out.println("Petrov: " + pb.get("Petrov"));
            System.out.println("Fedorov: " + pb.get("Fedorov"));

        }

        public static void showUnicWordsStat(String[] words) {
            HashMap<String, Integer> hm = new HashMap<>();

            for(String word : words) {
                if (hm.containsKey(word)) {
                    hm.put(word, hm.get(word) + 1);
                } else {
                    hm.put(word, 1);
                }
            }

            System.out.println("[Unic Word]\t[count]");
            for(String key : hm.keySet()) {
                System.out.println(String.format("%-8s\t%4s", key, hm.get(key)));
            }
        }
    }